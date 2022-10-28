package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se331.rest.dao.DocterDao;
import se331.rest.dao.EventDao;
import se331.rest.entity.Docter;
import se331.rest.entity.Event;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    EventDao eventDao;
    @Autowired
    DocterDao docterDao;

    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public Page<Event> getEvents(Integer pageSize, Integer page){
        return eventDao.getEvents(pageSize, page);
    }

    @Override
    public Event getEvent(Long id){
        return eventDao.getEvent(id);
    }

    @Override
    @Transactional
    public Event save(Event event){
        Docter docter = docterDao.findById(event.getDocter().getId()).orElse(null);
        event.setDocter(docter);
        docter.getOwnEvents().add(event);
        return eventDao.save(event);
    }
}
