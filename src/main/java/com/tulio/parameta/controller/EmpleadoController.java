package com.tulio.parameta.controller;

import com.tulio.parameta.dto.EmpleadoDTO;
import com.tulio.parameta.helper.ErrorResponse;
import com.tulio.parameta.service.EmpleadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
public class EmpleadoController {

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoController.class);

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/empleado")
    public ResponseEntity<?> getEmpleado(
            @RequestParam String nombres,
            @RequestParam String apellidos,
            @RequestParam String tipoDocumento,
            @RequestParam String numeroDocumento,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaNacimiento,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaVinculacion,
            @RequestParam String cargo,
            @RequestParam Double salario) {

        logger.info("Recibiendo solicitud para crear empleado con nombre: {} {}", nombres, apellidos);

        try {
            EmpleadoDTO empleadoDTO = new EmpleadoDTO(nombres, apellidos, tipoDocumento, numeroDocumento, fechaNacimiento, fechaVinculacion, cargo, salario);
            logger.debug("EmpleadoDTO creado: {}", empleadoDTO);

            // Llama al servicio para procesar el empleado
            EmpleadoDTO resultado = empleadoService.procesarEmpleado(empleadoDTO);
            logger.info("Empleado procesado exitosamente: {}", resultado);

            // Devuelve el empleado con la información adicional
            return ResponseEntity.ok(resultado);

        } catch (IllegalArgumentException e) {
            // Devuelve un error si hay una excepción de validación
            logger.warn("Error de validación: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(e.getMessage()));

        } catch (Exception e) {
            // Devuelve un error genérico para excepciones no controladas
            logger.error("Error interno del servidor: {}", e.getMessage(), e);
            return ResponseEntity.status(500).body("Error interno del servidor.");
        }
    }
}