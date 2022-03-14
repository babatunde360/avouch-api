package com.codeniro.avouch.Services.Identity.service;

import com.codeniro.avouch.Services.Identity.entities.Role;
import com.codeniro.avouch.Services.Identity.entities.User;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    User getUser(String username);
    User getUserByPhone(String phoneNumber);

    void addRoleToUser(String username, String roleName);
}
