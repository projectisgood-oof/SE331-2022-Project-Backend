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
                .id(111L)
                .homeTown("CNX1")
                .build());

        eventList.add(Event.builder()
                .id(222L)
                .homeTown("BKK2")
                .build());

        eventList.add(Event.builder()
                .id(333L)
                .homeTown("AMC3")
                .build());


    }


    @Override
    public Integer getEventSize(){
        return eventList.size();
    }

    @Override
    public Page<Event> getEvents(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? eventList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return new PageImpl<>(eventList.subList(firstIndex, firstIndex + pageSize),
                PageRequest.of(page, pageSize),
                eventList.size())
                ;
    }

    @Override
    public Event getEvent(Long id){

        return eventList.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);

    }

    @Override
    public Event save(Event event){
        event.setId(eventList.get(eventList.size()-1).getId()+1);
        eventList.add(event);
        return event;
    }


}
