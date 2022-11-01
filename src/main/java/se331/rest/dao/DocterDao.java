package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Docter;

import java.util.Optional;

public interface DocterDao {

    Integer getDocterSize();
    Page<Docter> getDocter(Pageable pageRequest);

    Docter getDocter(Long id);
        Optional<Docter> findById(Long id);
}
