package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.rest.entity.Docter;
import se331.rest.entity.DocterDTO;
import se331.rest.entity.Event;
import se331.rest.entity.EventDTO;

import java.util.List;

@Mapper
public interface LabMapper2 {

    LabMapper2 INSTANCE = Mappers.getMapper(LabMapper2.class);

    EventDTO getEventDto(Event event);

    List<EventDTO> getEventDto(List<Event> events);
    DocterDTO getDocterDTO(Docter docter);
    List<DocterDTO> getDocterDTO(List<Docter> docters);

}
