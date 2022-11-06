package se331.rest.service;

import org.springframework.data.domain.Page;
import se331.rest.entity.Docter;

import java.util.List;

public interface DocterService {
    List<Docter> getAllDocter();
    Page<Docter> getDocter(Integer page, Integer pageSize);

    Docter getDocter(Long id);

    Docter save(Docter docter);
}
