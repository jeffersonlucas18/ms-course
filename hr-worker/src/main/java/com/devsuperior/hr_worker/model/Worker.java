package com.devsuperior.hr_worker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Table(name = "worker")
@Entity
public class Worker implements Serializable {
    @Id
    private Long id;
    private String name;
    @Column(name = "daily_Income")
    private String dailyIncome;
}
