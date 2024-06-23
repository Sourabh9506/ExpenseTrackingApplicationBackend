package com.codeElevate.ExpenseTracker.services;

import com.codeElevate.ExpenseTracker.dto.ExpenseDTO;
import com.codeElevate.ExpenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id,ExpenseDTO expenseDTO);

    void deleteExpense(Long id);

//    Expense saveOrDelete()
}
