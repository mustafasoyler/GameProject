package com.mustafa.entity.manager;

import com.mustafa.entity.Authentication;
import com.mustafa.entity.User;

public class AuthenticationManager {

    public void Authentication(User user, Authentication authentication) {
        if (user.getAge() > 18) {

            if (user.getFirstName() == authentication.getUserFirstName() &&
                    user.getLastName() == authentication.getUserLastName() &&
                    user.getNationalId() == authentication.getUserNationalId()) {

                System.out.println(user.getFirstName() + " is real person. Authentication is succed.");

            } else {
                System.out.println(user.getFirstName() + " is not real person. Authentication is denied.");
            }
        }
    }
}