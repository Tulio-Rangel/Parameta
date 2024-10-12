package com.tulio.parameta.service;

import com.tulio.parameta.dto.EmpleadoDTO;
import com.tulio.parameta.entity.Empleado;
import com.tulio.parameta.repository.EmpleadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SOAPClient {

    private static final Logger logger = LoggerFactory.getLogger(SOAPClient.class);

    private final EmpleadoRepository empleadoRepository;

    public SOAPClient(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public void sendEmpleado(EmpleadoDTO empleadoDTO) {
        // Mappear EmpleadoDTO a Empleado entity y guardar en la base de datos
        Empleado empleado = new Empleado();
        empleado.setNombres(empleadoDTO.getNombres());
        empleado.setApellidos(empleadoDTO.getApellidos());
        empleado.setTipoDocumento(empleadoDTO.getTipoDocumento());
        empleado.setNumeroDocumento(empleadoDTO.getNumeroDocumento());
        empleado.setFechaNacimiento(empleadoDTO.getFechaNacimiento());
        empleado.setFechaVinculacion(empleadoDTO.getFechaVinculacion());
        empleado.setCargo(empleadoDTO.getCargo());
        empleado.setSalario(empleadoDTO.getSalario());

        empleadoRepository.save(empleado);
        logger.info("Empleado enviado y persistido: {}", empleado);
    }
}

