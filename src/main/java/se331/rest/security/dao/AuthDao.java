package se331.rest.security.dao;

import se331.rest.security.entity.Authority;

public interface AuthDao {
    Authority getAuthority(Long id);
}
