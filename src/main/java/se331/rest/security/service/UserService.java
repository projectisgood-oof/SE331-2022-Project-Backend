package se331.rest.security.service;

import se331.rest.security.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User findById(Long id);
    User save(User user);

}
