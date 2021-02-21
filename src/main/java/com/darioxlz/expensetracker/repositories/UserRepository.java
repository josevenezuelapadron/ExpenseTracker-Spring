package com.darioxlz.expensetracker.repositories;

import com.darioxlz.expensetracker.domain.User;
import com.darioxlz.expensetracker.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
