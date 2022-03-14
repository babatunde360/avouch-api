package com.codeniro.avouch.Services.Identity.repositories;

import com.codeniro.avouch.Services.Identity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByPhoneNumber(String phoneNumber);
}
