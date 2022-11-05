package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.DocterDao;
import se331.rest.entity.Docter;
import java.util.List;

@Service
public class DocterServiceImpl implements DocterService{
    @Autowired
    DocterDao docterDao;
    @Override
    public List<Docter> getAllDocter() {
        return docterDao.getDocter(Pageable.unpaged()).getContent();
    }

    @Override
    public Page<Docter> getDocter(Integer page, Integer pageSize) {
        return docterDao.getDocter(PageRequest.of(page,pageSize));
    }

    @Override
    public Docter getDocter(Long id) {
        return docterDao.getDocter(id);
    }



}
