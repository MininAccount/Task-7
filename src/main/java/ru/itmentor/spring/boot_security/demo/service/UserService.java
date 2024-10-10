package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();

    List<Role> getAllRoles();

    User getUserById(Long id);

    User addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
