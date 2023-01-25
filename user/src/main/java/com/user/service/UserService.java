package com.user.service;

import com.user.model.User;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;
    public List<User> getAllUser() {
        return repository.findAll();
    }

    public Optional<User> getUser(int userid) {
        return repository.findById(userid);
    }

    public User addUser(User user) {
        return repository.save(user);
    }

    public User updateUser(User user) {
        return repository.save(user);
    }

    public Optional<User> deleteUser(int id) {
        Optional<User> user = this.getUser(id);
        repository.deleteById(id);
        return user;
    }
}
