package com.tulio.parameta.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class EmpleadoDTO {
    private String nombres;
    private String apellidos;
    private String tipoDocumento;
    private String numeroDocumento;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fechaVinculacion;
    private String cargo;
    private Double salario;
    private String edad;
    private String tiempoVinculacion;

    // Constructor personalizado sin 'edad' y 'tiempoVinculacion'
    public EmpleadoDTO(String nombres, String apellidos, String tipoDocumento, String numeroDocumento,
                       Date fechaNacimiento, Date fechaVinculacion, String cargo, Double salario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaVinculacion = fechaVinculacion;
        this.cargo = cargo;
        this.salario = salario;
    }
}
