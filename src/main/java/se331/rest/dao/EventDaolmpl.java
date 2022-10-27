package se331.rest.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Event;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Profile("manual")
@Repository

public class EventDaolmpl implements EventDao{
    List<Event> eventList;

    @PostConstruct
    public void init() {
        eventList = new ArrayList<>();
        eventList.add(Event.builder()
                .id(1L)
                .name("Jevan")
                .surname("Wilson")
                .homeTown("907 Pennington Lane Ankeny, IA 50023")
                .age("29")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Janssen")
                .build());

        eventList.add(Event.builder()
                .id(2L)
                .name("Evelyn")
                .surname("Horne")
                .homeTown("8657 Prairie Drive Reynoldsburg, OH 43068")
                .age("52")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .build());

        eventList.add(Event.builder()
                .id(3L)
                .name("Tara")
                .surname("Hastings")
                .homeTown("9728 North Ridgewood Drive Randallstown, MD 21133")
                .age("16")
                .vaccinateStatus("Second dose")
                .firstDose("Moderna")
                .secondDose("Sinopharm")
                .build());

        eventList.add(Event.builder()
                .id(4L)
                .name("Will")
                .surname("Dickens")
                .homeTown("7826 Prince Rd. Newark, NJ 07103")
                .age("37")
                .vaccinateStatus("Second dose")
                .firstDose("Oxford")
                .secondDose("Janssen")
                .build());

        eventList.add(Event.builder()
                .id(5L)
                .name("Daniel")
                .surname("Lees")
                .homeTown("231 Bedford Street Canal Winchester, OH 43110")
                .age("21")
                .vaccinateStatus("First dose")
                .firstDose("Moderna")
                .secondDose("-")
                .build());

        eventList.add(Event.builder()
                .id(6L)
                .name("Farzana")
                .surname("Rennie")
                .homeTown("7578 NW. Green Street Taunton, MA 02780")
                .age("65")
                .vaccinateStatus("Second dose")
                .firstDose("Sputnik V")
                .secondDose("Janssen")
                .build());

        eventList.add(Event.builder()
                .id(7L)
                .name("Ishaaq")
                .surname("Brook")
                .homeTown("494 Wintergreen St. Berwyn, IL 60402")
                .age("17")
                .vaccinateStatus("First dose")
                .firstDose("Sinopharm")
                .secondDose("-")
                .build());

        eventList.add(Event.builder()
                .id(8L)
                .name("Mia-Rose")
                .surname("Zamora")
                .homeTown("8400 Inverness Avenue Boca Raton, FL 33428")
                .age("12")
                .vaccinateStatus("First dose")
                .firstDose("Pfizer")
                .secondDose("-")
                .build());

        eventList.add(Event.builder()
                .id(9L)
                .name("Yvette")
                .surname("Hendricks")
                .homeTown("3 Smith Drive Kingsport, TN 37660")
                .age("42")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Oxford")
                .build());

        eventList.add(Event.builder()
                .id(10L)
                .name("Aleeza")
                .surname("Alford")
                .homeTown("723 North Carson Dr. Owensboro, KY 42301")
                .age("26")
                .vaccinateStatus("Second dose")
                .firstDose("Pfizer")
                .secondDose("Pfizer")
                .build());

    }


    @Override
    public Integer getEventSize(){
        return eventList.size();
    }

    @Override
    public Page<Event> getEvents(Integer pageSize, Integer page){
        pageSize = pageSize == null ? eventList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return new PageImpl<>(eventList.subList(firstIndex, firstIndex + pageSize), PageRequest.of(page, pageSize),eventList.size());
    }

    @Override
    public Event getEvent(Long id){

        return eventList.stream().filter(event -> event.getID().equals(id)).findFirst().orElse(null);

    }

    @Override
    public Event save(Event event){
        event.setID(eventList.get(eventList.size()-1).getID()+1);
        eventList.add(event);
        return event;
    }


}
