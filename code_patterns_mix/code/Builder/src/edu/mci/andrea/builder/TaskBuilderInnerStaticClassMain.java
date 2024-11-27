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
public class TaskBuilderInnerStaticClassMain {

    public static void main(String[] args) {
        TaskBuilderInnerStatic task = new TaskBuilderInnerStatic.TaskBuilder(23)
                .name("Project Inner Static Class")
                .description("TBD")
                .budgetInEuro(10000)
                .startingOn(LocalDate.now())
                .build();
                
        System.out.println("Task -> " + task);
        
    }
}
