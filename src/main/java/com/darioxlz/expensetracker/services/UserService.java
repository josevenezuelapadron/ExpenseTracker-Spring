package com.darioxlz.expensetracker.services;

import com.darioxlz.expensetracker.domain.User;
import com.darioxlz.expensetracker.exceptions.EtAuthException;

public interface UserService {
    User validateUser (String email, String password) throws EtAuthException;

    User registerUser (String firstName, String lastName, String email, String password) throws EtAuthException;
}
