package se331.rest.service;

import se331.rest.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAdmins();

    Admin getAdmin(Long id);

    Admin save(Admin admin);
}
