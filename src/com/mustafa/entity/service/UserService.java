package com.mustafa.entity.service;

import com.mustafa.entity.User;

public interface UserService {
     void addUser(User user);
     void removeUser(User user);
     void updateUser(User user);
     void getAll(User[] users);
}
