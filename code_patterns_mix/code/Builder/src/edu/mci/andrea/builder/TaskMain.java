/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.andrea.builder;

/**
 *
 * @author andc
 */
public class TaskMain {

    public static void main(String[] args) {
        // without using this director class
        Task task = new TaskBuilder(5)
                        .name("Alfa")
                        .description("Alfa is a test project")
                        .getTask();
                
        System.out.println(task);
        System.out.println("--------------");
        
        // using the director class
        TaskDirector manager = new TaskDirector();
        manager.setTaskBuilder(new TaskBuilder(34));
        task = manager.buildStandardTask();
        System.out.println(task);
        System.out.println("--------------");
        manager.setTaskBuilder(29);
        task = manager.buildDummyTask();
        System.out.println(task);
    }

}
