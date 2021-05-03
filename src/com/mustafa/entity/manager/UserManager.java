package com.mustafa.entity.manager;

import com.mustafa.entity.User;
import com.mustafa.entity.service.UserService;

public class UserManager implements UserService {

    @Override
    public void addUser(User user) {
        System.out.println(" Username : " + user.getUserName() + " is added.");

    }

    @Override
    public void removeUser(User user) {
        System.out.println(" Username : " + user.getUserName() + " is removed.");

    }

    @Override
    public void updateUser(User user) {
        System.out.println( " Username : " + user.getUserName() + " is updated.");

    }

    @Override
    public void getAll(User[] users) {

        for(User user : users) {
            System.out.println(" Username : " + user.getUserName() + ".");
        }

    }


}
