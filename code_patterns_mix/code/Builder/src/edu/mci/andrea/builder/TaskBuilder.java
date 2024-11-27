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
public class TaskBuilder extends TaskBuilderAbstract {

    // this is for the mandatory part of an object of type Task
    public TaskBuilder(long id) {
        super.initialize(id);
    }

    @Override
    public TaskBuilder name(String name) {
        super.task.setName(name);
        return this;
    }

    @Override
    public TaskBuilder description(String description) {
        super.task.setDescription(description);
        return this;
    }

    @Override
    public TaskBuilder completionStatus(boolean completed) {
        super.task.setCompleted(completed);
        return this;
    }

    @Override
    public TaskBuilder budgetInEuro(float budget) {
        super.task.setBudget(budget);
        return this;
    }

    @Override
    public TaskBuilder startingOn(LocalDate startDate) {
        super.task.setStartDate(LocalDate.from(startDate));
        return this;
    }

    @Override
    public TaskBuilder endingOn(LocalDate endDate) {
        super.task.setEndDate(LocalDate.from(endDate));
        return this;
    }

    //@Override
    //public Task getTask() {
    //    return super.task;
    //}

}
