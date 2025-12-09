package com.devsuperior.hr_payrool.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
public class Worker implements Serializable {
    private Long id;
    private String name;
    @Column(name = "daily_Income")
    private Double dailyIncome;
}
