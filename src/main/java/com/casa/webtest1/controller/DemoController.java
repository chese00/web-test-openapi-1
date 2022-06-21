package com.casa.webtest1.controller;

import com.casa.demoopenapi3.controller.EjemploApi;
import com.casa.demoopenapi3.model.EjemploResponseDto;
import com.casa.demoopenapi3.model.EjemploResponseListDto;
import com.casa.webtest1.model.ProductsResponse;
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

        ResponseEntity<ProductsResponse> response = WebRequester.get("https://mocki.io/v1/d7d5047d-5d1c-4e25-9c8e-14531f0d3f5f",
                ProductsResponse.class);
        System.out.println(String.format("status: %s, body: %s", response.getStatusCode(),
                response.getBody()));

        return ResponseEntity.ok(servicioEjemplo.obtenerEjemploLista());
    }

}
