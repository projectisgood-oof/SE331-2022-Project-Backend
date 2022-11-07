package se331.rest.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.repository.DoctorRepository;
import se331.rest.security.dao.AuthDao;
import se331.rest.security.dao.UserDao;
import se331.rest.security.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Autowired
    AuthDao authDao;

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers(Pageable.unpaged()).getContent();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

}
