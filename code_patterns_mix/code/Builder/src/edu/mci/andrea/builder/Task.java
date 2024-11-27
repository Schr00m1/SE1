/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.andrea.builder;

import java.time.LocalDate;

/**
 *
 * @author andc
 */
public class Task {
    // Required parameter
    private final long id;
    // Optional parameters are initialized to default values
    private String name = "";
    private String description = "";
    private boolean completed = false;
    private float budget = 0.0f;
    private LocalDate startDate,
                      endDate;

    public Task(long id) {
        this.id = id;
    }

    public Task(long id, String name, String description, boolean completed,
                float budget, LocalDate startDate, LocalDate endDate) {
        this(id);
        this.name = name;
        this.description = description;
        this.budget = budget;
        this.completed = completed;
        this.startDate = startDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public LocalDate getStartDate() {
        return LocalDate.from(startDate);
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = LocalDate.from(startDate);
    }
    
    public LocalDate getEndDate() {
        return LocalDate.from(endDate);
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = LocalDate.from(endDate);
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", name=" + name + ", description=" + description + ", completed=" + completed + ", budget=" + budget + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

}