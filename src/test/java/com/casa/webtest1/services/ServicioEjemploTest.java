package com.casa.webtest1.services;

import com.casa.webtest1.model.mapper.EjemploMapper;
import com.casa.webtest1.model.mapper.EjemploMapperImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@Import({ServicioEjemplo.class, EjemploMapperImpl.class})
class ServicioEjemploTest {

    private ServicioEjemplo servicioEjemplo;

    @Autowired
    private EjemploMapperImpl mapper;

    @BeforeEach
    void init() {
        servicioEjemplo = new ServicioEjemplo(mapper);
    }

    @Test
    void shouldObtenerEjemplo() {
        assertEquals("cad", servicioEjemplo.obtenerEjemplo().getCadena());
    }

}