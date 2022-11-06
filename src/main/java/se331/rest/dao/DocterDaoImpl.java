package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Docter;
import se331.rest.repository.DoctorRepository;

import java.util.Optional;


@Repository
public class DocterDaoImpl implements DocterDao {
    @Autowired
    DoctorRepository docterRepository;

    @Override
    public Integer getDocterSize() {
        return Math.toIntExact(docterRepository.count());
    }

    @Override
    public Page<Docter> getDocter(Pageable pageRequest) {
        return docterRepository.findAll(pageRequest);
    }

    @Override
    public Docter getDocter(Long id) {
        return docterRepository.findById(id).orElse( null);
    }

    @Override
    public Optional<Docter> findById(Long id) {
        return docterRepository.findById(id);
    }

    @Override
    public Docter save(Docter doctor) {
        return docterRepository.save(doctor);
    }
    @Override
    public Page<Docter> getDoctors(Integer pageSize, Integer page) {
        return docterRepository.findAll(PageRequest.of(page-1,pageSize));
    }

    @Override
    public Page<Docter> getDoctors(String name, Pageable page) {
        return docterRepository.findByNameIgnoreCaseContaining(name, page);
    }
}
