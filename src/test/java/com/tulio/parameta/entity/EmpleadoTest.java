package com.tulio.parameta.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;

class EmpleadoTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Empleado#equals(Object)}
     *   <li>{@link Empleado#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertEquals(empleado, empleado2);
        int expectedHashCodeResult = empleado.hashCode();
        assertEquals(expectedHashCodeResult, empleado2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Empleado#equals(Object)}
     *   <li>{@link Empleado#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos(null);
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos(null);
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertEquals(empleado, empleado2);
        int expectedHashCodeResult = empleado.hashCode();
        assertEquals(expectedHashCodeResult, empleado2.hashCode());
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Empleado#equals(Object)}
     *   <li>{@link Empleado#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertEquals(empleado, empleado);
        int expectedHashCodeResult = empleado.hashCode();
        assertEquals(expectedHashCodeResult, empleado.hashCode());
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Nombres");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos(null);
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Nombres");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo(null);
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(null);
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(null);
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(2L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(null);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Apellidos");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres(null);
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("Nombres");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento(null);
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(null);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(0.5d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual17() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("Nombres");

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual18() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento(null);

        Empleado empleado2 = new Empleado();
        empleado2.setApellidos("Apellidos");
        empleado2.setCargo("Cargo");
        empleado2.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2
                .setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado2.setId(1L);
        empleado2.setNombres("Nombres");
        empleado2.setNumeroDocumento("alice.liddell@example.org");
        empleado2.setSalario(10.0d);
        empleado2.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, empleado2);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, null);
    }

    /**
     * Method under test: {@link Empleado#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        Empleado empleado = new Empleado();
        empleado.setApellidos("Apellidos");
        empleado.setCargo("Cargo");
        empleado.setFechaNacimiento(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setFechaVinculacion(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));
        empleado.setId(1L);
        empleado.setNombres("Nombres");
        empleado.setNumeroDocumento("alice.liddell@example.org");
        empleado.setSalario(10.0d);
        empleado.setTipoDocumento("alice.liddell@example.org");

        // Act and Assert
        assertNotEquals(empleado, "Different type to Empleado");
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link Empleado}
     *   <li>{@link Empleado#setApellidos(String)}
     *   <li>{@link Empleado#setCargo(String)}
     *   <li>{@link Empleado#setFechaNacimiento(Date)}
     *   <li>{@link Empleado#setFechaVinculacion(Date)}
     *   <li>{@link Empleado#setId(Long)}
     *   <li>{@link Empleado#setNombres(String)}
     *   <li>{@link Empleado#setNumeroDocumento(String)}
     *   <li>{@link Empleado#setSalario(Double)}
     *   <li>{@link Empleado#setTipoDocumento(String)}
     *   <li>{@link Empleado#toString()}
     *   <li>{@link Empleado#getApellidos()}
     *   <li>{@link Empleado#getCargo()}
     *   <li>{@link Empleado#getFechaNacimiento()}
     *   <li>{@link Empleado#getFechaVinculacion()}
     *   <li>{@link Empleado#getId()}
     *   <li>{@link Empleado#getNombres()}
     *   <li>{@link Empleado#getNumeroDocumento()}
     *   <li>{@link Empleado#getSalario()}
     *   <li>{@link Empleado#getTipoDocumento()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        Empleado actualEmpleado = new Empleado();
        actualEmpleado.setApellidos("Apellidos");
        actualEmpleado.setCargo("Cargo");
        Date fechaNacimiento = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualEmpleado.setFechaNacimiento(fechaNacimiento);
        Date fechaVinculacion = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualEmpleado.setFechaVinculacion(fechaVinculacion);
        actualEmpleado.setId(1L);
        actualEmpleado.setNombres("Nombres");
        actualEmpleado.setNumeroDocumento("alice.liddell@example.org");
        actualEmpleado.setSalario(10.0d);
        actualEmpleado.setTipoDocumento("alice.liddell@example.org");
        actualEmpleado.toString();
        String actualApellidos = actualEmpleado.getApellidos();
        String actualCargo = actualEmpleado.getCargo();
        Date actualFechaNacimiento = actualEmpleado.getFechaNacimiento();
        Date actualFechaVinculacion = actualEmpleado.getFechaVinculacion();
        Long actualId = actualEmpleado.getId();
        String actualNombres = actualEmpleado.getNombres();
        String actualNumeroDocumento = actualEmpleado.getNumeroDocumento();
        Double actualSalario = actualEmpleado.getSalario();

        // Assert that nothing has changed
        assertEquals("Apellidos", actualApellidos);
        assertEquals("Cargo", actualCargo);
        assertEquals("Nombres", actualNombres);
        assertEquals("alice.liddell@example.org", actualNumeroDocumento);
        assertEquals("alice.liddell@example.org", actualEmpleado.getTipoDocumento());
        assertEquals(10.0d, actualSalario.doubleValue());
        assertEquals(1L, actualId.longValue());
        assertSame(fechaNacimiento, actualFechaNacimiento);
        assertSame(fechaVinculacion, actualFechaVinculacion);
    }
}
