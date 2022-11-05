package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Docter;

public interface DoctorRepository extends JpaRepository<Docter,Long> {
    //List<Event> findAll();
}
