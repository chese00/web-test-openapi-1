package com.casa.webtest1.controller;

import com.casa.demoopenapi3.controller.EjemploApi;
import com.casa.demoopenapi3.model.EjemploResponseDto;
import com.casa.demoopenapi3.model.EjemploResponseListDto;
import com.casa.webtest1.services.ServicioEjemplo;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController implements EjemploApi {

    @NonNull
    private ServicioEjemplo servicioEjemplo;

    public ResponseEntity<EjemploResponseDto> ejemplo(String divisionNumber) {
        return ResponseEntity.ok(servicioEjemplo.obtenerEjemplo());
    }

    public ResponseEntity<EjemploResponseListDto> ejemplo1() {
        return ResponseEntity.ok(servicioEjemplo.obtenerEjemploLista());
    }

}
