package com.codekru.springboot.mysql.service;

import java.util.List;

import com.codekru.springboot.mysql.entity.User;

public interface UserService {

    public List<User> getUsers();

    public User addUser(User user);

}
