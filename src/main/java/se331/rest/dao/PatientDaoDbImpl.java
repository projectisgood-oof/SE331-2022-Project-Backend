package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import se331.rest.entity.Patient;
import se331.rest.repository.PatientRepository;

@Profile("db")
@Repository
@Service
public class PatientDaoDbImpl implements PatientDao {
    @Autowired
    PatientRepository paitentRepository;
    @Override
    public Integer getEventSize(){
        return Math.toIntExact(paitentRepository.count());
    }

    @Override
    public Page<Patient> getEvents(Integer pageSize, Integer page){
        return paitentRepository.findAll(PageRequest.of(page-1,pageSize));
    }

    @Override
    public Patient getEvent(Long id) { return paitentRepository.findById(id).orElse( null); }

    @Override
    public Patient save(Patient event){
        return paitentRepository.save(event);
    }

    @Override
    public Page<Patient> getEvent(String name, Pageable page) {
        //return paitentRepository.findByTitle(title,page);
        return paitentRepository.findByNameContainingIgnoreCase(name,page);
        //return paitentRepository.findByNameIgnoreCaseOrDocterIgnoreCase(title,title,page);
        //return paitentRepository.findByNameContainingIgnoreCaseOrDocterContainingIgnoreCase(title,title,page);
        //return paitentRepository.findByNameContainingOrAgeContainingOrVaccinateStatusIgnoreCaseContaining(name,name,name,page);

    }

}
