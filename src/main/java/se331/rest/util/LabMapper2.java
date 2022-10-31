package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.rest.entity.Docter;
import se331.rest.entity.DocterDTO;
import se331.rest.entity.Event;
import se331.rest.entity.EventDTO;
import se331.rest.security.entity.DoctorAuthDTO;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(imports = Collectors.class)
public interface LabMapper2 {

    LabMapper2 INSTANCE = Mappers.getMapper(LabMapper2.class);

    EventDTO getEventDto(Event event);

    List<EventDTO> getEventDto(List<Event> events);
    DocterDTO getDocterDTO(Docter docter);
    List<DocterDTO> getDocterDTO(List<Docter> docters);
    @Mapping( target = "authorities",
            expression = "java(docter.getUser().getAuthorities().stream().map(auth -> auth.getName().name()).collect(Collectors.toList()))")
    DoctorAuthDTO getDoctorAuthDTO(Docter docter);


}
