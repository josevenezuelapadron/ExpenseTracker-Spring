package com.darioxlz.expensetracker.repositories;

import com.darioxlz.expensetracker.domain.Transaction;
import com.darioxlz.expensetracker.exceptions.EtBadRequestException;
import com.darioxlz.expensetracker.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionRepository {
    List<Transaction> findAll(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryID, Double amout, String note, Long transactionDate) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
