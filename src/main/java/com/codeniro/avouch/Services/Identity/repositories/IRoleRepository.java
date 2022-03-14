package com.codeniro.avouch.Services.Identity.repositories;

import com.codeniro.avouch.Services.Identity.entities.Role;
import com.codeniro.avouch.Services.Identity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
