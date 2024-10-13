package com.tulio.parameta.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.tulio.parameta.dto.EmpleadoDTO;
import com.tulio.parameta.repository.EmpleadoRepository;

import java.time.LocalDate;
import java.time.ZoneOffset;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {EmpleadoService.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class EmpleadoServiceTest {
    @MockBean
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoService empleadoService;

    @MockBean
    private SOAPClient soapClient;

    @Test
    void testProcesarEmpleado() {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setNombres("");

        assertThrows(IllegalArgumentException.class, () -> empleadoService.procesarEmpleado(empleadoDTO));
    }

    @Test
    void testProcesarEmpleado2() {
        java.sql.Date date = mock(java.sql.Date.class);
        when(date.toInstant()).thenReturn(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        EmpleadoDTO empleadoDTO = mock(EmpleadoDTO.class);
        when(empleadoDTO.getFechaVinculacion()).thenReturn(date);
        when(empleadoDTO.getSalario()).thenReturn(10.0d);
        when(empleadoDTO.getFechaNacimiento())
                .thenReturn(java.util.Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        when(empleadoDTO.getCargo()).thenReturn("Cargo");
        when(empleadoDTO.getNumeroDocumento()).thenReturn("12345678");
        when(empleadoDTO.getTipoDocumento()).thenReturn("CC");
        when(empleadoDTO.getApellidos()).thenReturn("Apellidos");
        when(empleadoDTO.getNombres()).thenReturn("Nombres");
        doNothing().when(empleadoDTO).setNombres(Mockito.<String>any());
        empleadoDTO.setNombres("");

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> empleadoService.procesarEmpleado(empleadoDTO));
        verify(empleadoDTO).getApellidos();
        verify(empleadoDTO).getCargo();
        verify(empleadoDTO).getFechaNacimiento();
        verify(empleadoDTO).getFechaVinculacion();
        verify(empleadoDTO).getNombres();
        verify(empleadoDTO).getNumeroDocumento();
        verify(empleadoDTO).getSalario();
        verify(empleadoDTO).getTipoDocumento();
        verify(empleadoDTO).setNombres(eq(""));
        verify(date).toInstant();
    }
}
