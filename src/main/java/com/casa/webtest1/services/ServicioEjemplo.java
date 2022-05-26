package com.casa.webtest1.services;

import com.casa.demoopenapi3.model.EjemploResponseDto;
import com.casa.demoopenapi3.model.EjemploResponseListDto;
import com.casa.webtest1.model.EjemploEntity;
import com.casa.webtest1.model.mapper.EjemploMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicioEjemplo {

    @NonNull
    private final EjemploMapper mapper;

    public EjemploResponseDto obtenerEjemplo() {
        EjemploEntity ejemplo = EjemploEntity.builder()
                .cadena("cad")
                .numero(1L)
                .build();

        return mapper.toEjemploResponseDto(ejemplo);
    }

    public EjemploResponseListDto obtenerEjemploLista() {
        List<EjemploEntity> list = new ArrayList<>();
        list.add(EjemploEntity.builder()
                .cadena("cad")
                .numero(1L)
                .build());
        list.add(EjemploEntity.builder()
                .cadena("cad")
                .numero(2L)
                .build());

        EjemploResponseListDto response = new EjemploResponseListDto();
        response.addAll(mapper.toEjemploResponseDtoList(list));
        return response;
    }
}
