package com.example.demo.service.impl;

import com.example.demo.domain.Model.User;
import com.example.demo.domain.repository.UserReposditory;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserReposditory userReposditory;

    @Override
    public User findById(Long id) {
        return userReposditory.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userTocreate) {
        if( userReposditory.existsByAccountNumber(userTocreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This User ID already exists");
        }
        return this.userReposditory.save(userTocreate);
    }
}
