package com.casa.webtest1.services;

import com.casa.demoopenapi3.model.EjemploResponseDto;
import com.casa.demoopenapi3.model.EjemploResponseListDto;
import com.casa.webtest1.model.EjemploEntity;
import com.casa.webtest1.model.Persona;
import com.casa.webtest1.model.mapper.EjemploMapper;
import com.casa.webtest1.repository.Persona1Repository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicioEjemplo {

    @NonNull
    private final EjemploMapper mapper;

    @Autowired
    private Persona1Repository persona1Repository;

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

        Persona persona = Persona.builder().nombre("uno").identificacion("ide").build();
        persona1Repository.save(persona);

        persona1Repository.findAll().stream().forEach(p -> System.out.println(p.getId()));
        return response;
    }
}
