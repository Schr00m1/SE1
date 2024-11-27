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
public class TaskDirector {

    private TaskBuilderAbstract taskBuilder;

    public void setTaskBuilder(TaskBuilderAbstract taskBuilder) {
        this.taskBuilder = taskBuilder;
    }

    public void setTaskBuilder(int id) {
        this.taskBuilder.initialize(id);
    }
    
    // building algorithm
    public Task buildStandardTask() {
        // if old TaskBuilder is used for this algorithm, it is
        // reseted before being use i.e. guaranteed not to contained
        // partial dats from the previous use
        taskBuilder.initialize(taskBuilder.getTask().getId());
        return taskBuilder.completionStatus(false)
                        .description("Missing description")
                        .budgetInEuro(10000)
                        .startingOn(LocalDate.now())
                        .getTask();
    }
    
    // building algorithm
    public Task buildDummyTask() {
        // if old TaskBuilder is used for this algorithm, it is
        // reseted before being use i.e. guaranteed not to contained
        // partial dats from the previous use
        taskBuilder.initialize(taskBuilder.getTask().getId());
        LocalDate today = LocalDate.now();
        return taskBuilder.name("Dummy")
                        .completionStatus(false)
                        .budgetInEuro(1)
                        .startingOn(today)
                        .endingOn(today.plusYears(1))
                        .getTask();
    }

}
