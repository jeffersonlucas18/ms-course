package com.devsuperior.hr_payrool.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    //    @Id
    private Long id;

    private String name;

    //    @Column(name = "daily_Income")
    private Double dailyIncome;

    private Long days;

    private Double total;
}
