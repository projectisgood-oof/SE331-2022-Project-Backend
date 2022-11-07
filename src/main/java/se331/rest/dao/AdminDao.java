package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Admin;

public interface AdminDao {
    Page<Admin> getAdmins(Pageable pagerequest);

    Admin findById(Long id);

    Admin save(Admin admin);
}