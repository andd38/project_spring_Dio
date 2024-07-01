package com.example.demo.service;

import com.example.demo.domain.Model.User;

public interface UserService {

    User findById(Long id);

    User create(User userTocreate);

}
