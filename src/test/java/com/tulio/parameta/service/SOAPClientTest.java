package com.tulio.parameta.service;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.tulio.parameta.dto.EmpleadoDTO;
import com.tulio.parameta.entity.Empleado;
import com.tulio.parameta.repository.EmpleadoRepository;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SOAPClient.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class SOAPClientTest {
    @MockBean
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private SOAPClient soapClient;

    @Test
    void testSendEmpleado() {
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("12345678");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("12345678");
        when(empleadoRepository.save(Mockito.<Empleado>any())).thenReturn(empleado);

        soapClient.sendEmpleado(new EmpleadoDTO());

        verify(empleadoRepository).save(isA(Empleado.class));
    }
}
