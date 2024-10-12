package com.tulio.parameta.service;

import com.tulio.parameta.dto.EmpleadoDTO;
import com.tulio.parameta.entity.Empleado;
import com.tulio.parameta.repository.EmpleadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

@Service
public class EmpleadoService {

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoService.class);

    private final SOAPClient soapClient;
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(SOAPClient soapClient, EmpleadoRepository empleadoRepository) {
        this.soapClient = soapClient;
        this.empleadoRepository = empleadoRepository;
    }

    public EmpleadoDTO procesarEmpleado(EmpleadoDTO empleadoDTO) {
        // Validaciones
        if (empleadoDTO.getNombres().isEmpty() ||
                empleadoDTO.getApellidos().isEmpty() ||
                empleadoDTO.getTipoDocumento().isEmpty() ||
                empleadoDTO.getNumeroDocumento().isEmpty() ||
                empleadoDTO.getCargo().isEmpty() ||
                empleadoDTO.getSalario() == null) {
            throw new IllegalArgumentException("Todos los campos son obligatorios.");
        }

        LocalDate birthDate = empleadoDTO.getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate joinDate = empleadoDTO.getFechaVinculacion().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();

        if (Period.between(birthDate, today).getYears() < 18) {
            throw new IllegalArgumentException("El empleado debe ser mayor de edad.");
        }

        // Persistir empleado en la base de datos a través del cliente SOAP
        Empleado empleado = mapToEntity(empleadoDTO);
        empleadoRepository.save(empleado);
        logger.info("Empleado persistido en la base de datos: {}", empleado);
        soapClient.sendEmpleado(empleadoDTO);

        // Calcular tiempo de vinculación y edad actual
        Period tiempoVinculacion = Period.between(joinDate, today);
        Period edadEmpleado = Period.between(birthDate, today);

        empleadoDTO.setEdad(edadEmpleado.getYears() + " años, " + edadEmpleado.getMonths() + " meses, " + edadEmpleado.getDays() + " días");
        empleadoDTO.setTiempoVinculacion(tiempoVinculacion.getYears() + " años, " + tiempoVinculacion.getMonths() + " meses, " + tiempoVinculacion.getDays() + " días");

        return empleadoDTO;
    }

    private Empleado mapToEntity(EmpleadoDTO empleadoDTO) {
        Empleado empleado = new Empleado();
        empleado.setNombres(empleadoDTO.getNombres());
        empleado.setApellidos(empleadoDTO.getApellidos());
        empleado.setTipoDocumento(empleadoDTO.getTipoDocumento());
        empleado.setNumeroDocumento(empleadoDTO.getNumeroDocumento());
        empleado.setFechaNacimiento(empleadoDTO.getFechaNacimiento());
        empleado.setFechaVinculacion(empleadoDTO.getFechaVinculacion());
        empleado.setCargo(empleadoDTO.getCargo());
        empleado.setSalario(empleadoDTO.getSalario());
        return empleado;
    }
}
