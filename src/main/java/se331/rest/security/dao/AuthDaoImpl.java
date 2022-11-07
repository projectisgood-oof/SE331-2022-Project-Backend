package se331.rest.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import se331.rest.security.entity.Authority;
import se331.rest.security.repository.AuthorityRepository;

@Profile("db")
@Repository
public class AuthDaoImpl implements AuthDao{
    @Autowired
    AuthorityRepository authorityRepository;
    @Override
    public Authority getAuthority(Long id) {
        return authorityRepository.findById(id).orElse(null);
    }
}