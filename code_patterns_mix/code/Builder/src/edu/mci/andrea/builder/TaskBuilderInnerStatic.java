/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.andrea.builder;

import java.time.LocalDate;

/**
 *
 * @author AndreaCorradini
 */
public class TaskBuilderInnerStatic {
    // Required parameter
    private final long id;
    // Optional parameters are initialized to default values
    private String name = "";
    private String description = "";
    private boolean completed = false;
    private float budget = 0.0f;
    private LocalDate startDate,
                      endDate;

    public static class TaskBuilder {
        // Required parameter
        private final long id;
        // Optional parameters are initialized to default values
        private String name = "";
        private String description = "";
        private boolean completed = false;
        private float budget = 0.0f;
        private LocalDate startDate,
                          endDate;

        public TaskBuilder(long id) {
            this.id = id;
        }
        
        public TaskBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TaskBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder completionStatus(boolean completed) {
            this.completed = completed;
            return this;
        }

        public TaskBuilder budgetInEuro(float budget) {
            this.budget = budget;
            return this;
        }

        public TaskBuilder startingOn(LocalDate startDate) {
            this.startDate = LocalDate.from(startDate);
            return this;
        }

        public TaskBuilder endingOn(LocalDate endDate) {
            this.endDate = LocalDate.from(endDate);
            return this;
        }

        public TaskBuilderInnerStatic build() {
            return new TaskBuilderInnerStatic(this);
        }
    }

    private TaskBuilderInnerStatic(TaskBuilder taskBuilder) {
        this.id = taskBuilder.id;
        this.name = taskBuilder.name;
        this.description = taskBuilder.description;
        this.completed = taskBuilder.completed;
        this.budget = taskBuilder.budget;
        this.startDate = taskBuilder.startDate;
        this.endDate = taskBuilder.endDate;
    }
    
    @Override
    public String toString() {
        return "TaskBuilderInnerStaticClass{" + "id=" + id + ", name=" + name + ", description=" + description + ", completed=" + completed + ", budget=" + budget + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

}
