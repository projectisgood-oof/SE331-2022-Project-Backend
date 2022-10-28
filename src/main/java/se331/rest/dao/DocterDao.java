package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Docter;

public interface DocterDao {
    Page<Docter> getDocter(Pageable pageRequest);
}
