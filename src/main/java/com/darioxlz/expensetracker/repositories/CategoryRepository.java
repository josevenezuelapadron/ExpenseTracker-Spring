package com.darioxlz.expensetracker.repositories;

import com.darioxlz.expensetracker.domain.Category;
import com.darioxlz.expensetracker.domain.User;
import com.darioxlz.expensetracker.exceptions.EtAuthException;
import com.darioxlz.expensetracker.exceptions.EtBadRequestException;
import com.darioxlz.expensetracker.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {
    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
