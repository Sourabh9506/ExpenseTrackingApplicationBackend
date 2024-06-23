package com.codeElevate.ExpenseTracker.entity;
import com.codeElevate.ExpenseTracker.dto.IncomeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private Integer amount;

    private LocalDate date;

    private String category;

    private String description;

    public IncomeDTO getIncomeDto(){
        IncomeDTO incomeDto = new IncomeDTO();
        incomeDto.setId(id);
        incomeDto.setTitle(title);
        incomeDto.setCategory(category);
        incomeDto.setDate(date);

        return incomeDto;
    }

}
