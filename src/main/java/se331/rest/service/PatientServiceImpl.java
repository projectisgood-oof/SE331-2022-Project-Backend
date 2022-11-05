package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se331.rest.dao.DocterDao;
import se331.rest.dao.PatientDao;
import se331.rest.entity.Docter;
import se331.rest.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientDao patientDao;
    @Autowired
    DocterDao docterDao;

    @Override
    public Integer getEventSize() {
        return patientDao.getEventSize();
    }

    @Override
    public Page<Patient> getEvents(Integer pageSize, Integer page){
        return patientDao.getEvents(pageSize, page);
    }

    @Override
    public Patient getEvent(Long id){
        return patientDao.getEvent(id);
    }

    @Override
    @Transactional
    public Patient save(Patient event){
        Docter docter = docterDao.findById(event.getDocter().getId()).orElse(null);
        event.setDocter(docter);
        docter.getOwnEvents().add(event);
        return patientDao.save(event);
    }


    @Override
    public Page<Patient> getEvents(String title, Pageable pageable){

        return patientDao.getEvent(title,pageable);
    }

}
