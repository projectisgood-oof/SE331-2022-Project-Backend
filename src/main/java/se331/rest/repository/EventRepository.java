package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Event;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAll();

    //Page<Event> findByTitle(String title, Pageable pageRequest);
    Page<Event> findByNameContainingIgnoreCase(String name, Pageable pageRequest);
    Page<Event> findByNameContainingIgnoreCaseOrDocterContainingIgnoreCase(String name, String docter, Pageable pageable);

    //Page<Event> findByNameContainingOrAgeContainingOrVaccinateStatusIgnoreCaseContaining(String name,String age,String vaccinateStatus, Pageable pageRequest);

}
