package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    //List<Event> findAll();
}
