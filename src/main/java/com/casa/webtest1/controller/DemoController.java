package com.casa.webtest1.controller;

import com.casa.demoopenapi3.controller.EjemploApi;
import com.casa.demoopenapi3.model.EjemploResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements EjemploApi {
    public ResponseEntity<EjemploResponseDto> ejemplo(String divisionNumber) {
        return ResponseEntity.ok(new EjemploResponseDto()) ;
    }

}
