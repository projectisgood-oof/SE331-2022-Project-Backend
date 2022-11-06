package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.Docter;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Docter,Long> {
    List<Docter> findAll();
    Page<Docter> findByNameIgnoreCaseContaining(String name, Pageable pageRequest);
}
