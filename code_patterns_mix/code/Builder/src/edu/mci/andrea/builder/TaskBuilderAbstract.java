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
public abstract class TaskBuilderAbstract {
    protected Task task;
    
    protected void initialize(long id) { // this is the reset
        task = new Task(id); // a Task must have at least one id
    }

    public final Task getTask() {
        return task;
    }
    
    // methods used to build different parts of a Task object
    public abstract TaskBuilderAbstract name(String name);
    public abstract TaskBuilderAbstract description(String description);
    public abstract TaskBuilderAbstract completionStatus(boolean completed);
    public abstract TaskBuilderAbstract budgetInEuro(float budget);
    public abstract TaskBuilderAbstract startingOn(LocalDate startDate);
    public abstract TaskBuilderAbstract endingOn(LocalDate startDate);
    
}
