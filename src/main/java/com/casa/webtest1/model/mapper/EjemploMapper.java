package com.casa.webtest1.model.mapper;

import com.casa.demoopenapi3.model.EjemploResponseDto;
import com.casa.webtest1.model.EjemploEntity;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface EjemploMapper {

//    @Mappings({
//            @Mapping(source = "entity",
//                    target = "payloadChange", qualifiedByName = "getPayloadChange"),
//            @Mapping(source = "reprocessFromCill", target = "reprocessFromCILL")})
    EjemploResponseDto toEjemploResponseDto(final EjemploEntity entity);

    List<EjemploResponseDto> toEjemploResponseDtoList(final List<EjemploEntity> entities);


    /**
     * Converts the payload to map to enable dynamic keys.
     *
     * @param entity the entity object.
     * @return the action.
     */
//    @Named("getPayloadChange")
//    default Map<String, Object> getPayloadChange(
//            final ErrorHeader entity) {
//        Map<String, Object> payload = new HashMap<>();
//        if (entity.getPayloadChange() != null) {
//            payload = new HashMap<>(entity.getPayloadChange().asMap());
//        }
//
//        return payload;
//    }
}