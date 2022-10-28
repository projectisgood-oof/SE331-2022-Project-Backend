package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Docter;
import se331.rest.repository.DocterRepository;

import java.util.Optional;


@Repository
public class DocterDaoImpl implements DocterDao {
    @Autowired
    DocterRepository docterRepository;
    @Override
    public Page<Docter> getDocter(Pageable pageRequest) {
        return docterRepository.findAll(pageRequest);
    }
    @Override
    public Optional<Docter> findById(Long id) {
        return docterRepository.findById(id);
    }
}
