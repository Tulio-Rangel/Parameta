package com.tulio.parameta.controller;

import com.tulio.parameta.service.EmpleadoService;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {EmpleadoController.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class EmpleadoControllerTest {
    @Autowired
    private EmpleadoController empleadoController;

    @MockBean
    private EmpleadoService empleadoService;

    @Test
    void testGetEmpleado() throws Exception {
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/empleado")
                .param("apellidos", "foo")
                .param("cargo", "foo");
        MockHttpServletRequestBuilder paramResult2 = paramResult.param("fechaNacimiento",
                String.valueOf(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())));
        MockHttpServletRequestBuilder paramResult3 = paramResult2
                .param("fechaVinculacion",
                        String.valueOf(Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())))
                .param("nombres", "foo")
                .param("numeroDocumento", "12345678");
        MockHttpServletRequestBuilder requestBuilder = paramResult3.param("salario", String.valueOf(10.0d))
                .param("tipoDocumento", "CC");

        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(empleadoController)
                .build()
                .perform(requestBuilder);

        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }
}
