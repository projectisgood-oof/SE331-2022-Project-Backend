package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findAll();

    //Page<Event> findByTitle(String title, Pageable pageRequest);
    Page<Patient> findByNameContainingIgnoreCase(String name, Pageable pageRequest);
    Page<Patient> findByNameContainingIgnoreCaseOrDocterContainingIgnoreCase(String name, String docter, Pageable pageable);

    //Page<Patient> findByNameContainingOrAgeContainingOrVaccinateStatusIgnoreCaseContaining(String name,String age,String vaccinateStatus, Pageable pageRequest);

}
