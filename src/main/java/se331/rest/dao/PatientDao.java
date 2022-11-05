package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Patient;


public interface PatientDao {
    Integer getEventSize();
    Page<Patient> getEvents(Integer pageSize, Integer page);
    Patient getEvent(Long id);

    Patient save(Patient event);
    Page<Patient> getEvent(String name, Pageable page);
}