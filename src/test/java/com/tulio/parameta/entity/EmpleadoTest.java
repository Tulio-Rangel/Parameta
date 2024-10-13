package com.tulio.parameta.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EmpleadoTest {
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        Empleado empleado = new Empleado();
        empleado.setApellidos("Rangel");
        empleado.setCargo("Desarrollador");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1990, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Tulio");
        empleado.setNumeroDocumento("1234");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("CC");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Rangel");
        empleado2.setCargo("Desarrollador");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setFechaVinculacion(Date.from(LocalDate.of(1990, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Tulio");
        empleado2.setNumeroDocumento("1234");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("CC");

        assertEquals(empleado, empleado2);
        int expectedHashCodeResult = empleado.hashCode();
        assertEquals(expectedHashCodeResult, empleado2.hashCode());
    }

    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        Empleado empleado = new Empleado();
        empleado.setApellidos("Nuñez");
        empleado.setCargo("Desarrolldor");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1990, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Junior");
        empleado.setNumeroDocumento("1234");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("CC");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Rangel");
        empleado2.setCargo("Desarrollador");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1990, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Tulio");
        empleado2.setNumeroDocumento("12345");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("CC");

        assertNotEquals(empleado, empleado2);
    }

    @Test
    void testGettersAndSetters() {
        Empleado actualEmpleado = new Empleado();
        actualEmpleado.setApellidos("Rangel");
        actualEmpleado.setCargo("Desarrollador");
        Date fechaNacimiento = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualEmpleado.setFechaNacimiento(fechaNacimiento);
        Date fechaVinculacion = Date.from(LocalDate.of(1990, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualEmpleado.setFechaVinculacion(fechaVinculacion);
        actualEmpleado.setId(1L);
        actualEmpleado.setNombres("Tulio");
        actualEmpleado.setNumeroDocumento("1234");
        actualEmpleado.setSalario(10.0d);
        actualEmpleado.setTipoDocumento("CC");
        actualEmpleado.toString();
        String actualApellidos = actualEmpleado.getApellidos();
        String actualCargo = actualEmpleado.getCargo();
        Date actualFechaNacimiento = actualEmpleado.getFechaNacimiento();
        Date actualFechaVinculacion = actualEmpleado.getFechaVinculacion();
        Long actualId = actualEmpleado.getId();
        String actualNombres = actualEmpleado.getNombres();
        String actualNumeroDocumento = actualEmpleado.getNumeroDocumento();
        Double actualSalario = actualEmpleado.getSalario();

        assertEquals("Rangel", actualApellidos);
        assertEquals("Desarrollador", actualCargo);
        assertEquals("Tulio", actualNombres);
        assertEquals("1234", actualNumeroDocumento);
        assertEquals("CC", actualEmpleado.getTipoDocumento());
        assertEquals(10.0d, actualSalario.doubleValue());
        assertEquals(1L, actualId.longValue());
        assertSame(fechaNacimiento, actualFechaNacimiento);
        assertSame(fechaVinculacion, actualFechaVinculacion);
    }
}
