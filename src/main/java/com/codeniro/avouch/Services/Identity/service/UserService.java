package com.codeniro.avouch.Services.Identity.service;

import com.codeniro.avouch.Services.Identity.entities.Role;
import com.codeniro.avouch.Services.Identity.entities.User;
import com.codeniro.avouch.Services.Identity.repositories.IRoleRepository;
import com.codeniro.avouch.Services.Identity.repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @RequiredArgsConstructor @Transactional //@slf4j
public class UserService implements  IUserService{
    private final IUserRepository userRepository;
    private final IRoleRepository roleRepository;


    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public User getUserByPhone(String phoneNumber) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }
}
