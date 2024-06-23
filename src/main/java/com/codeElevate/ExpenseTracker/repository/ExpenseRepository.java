package com.codeElevate.ExpenseTracker.repository;

import com.codeElevate.ExpenseTracker.entity.Expense;
import com.codeElevate.ExpenseTracker.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {

    List<Expense> findByDateBetween(LocalDate startDate, LocalDate endDate);

    @Query("Select SUM(e.amount) FROM Expense e")
    Double sumAllAmounts();

    Optional<Expense> findFirstByOrderByDateDesc();

}
