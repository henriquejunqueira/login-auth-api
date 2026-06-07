package com.henriquejunqueira.login_auth_api.repositories;

import com.henriquejunqueira.login_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
