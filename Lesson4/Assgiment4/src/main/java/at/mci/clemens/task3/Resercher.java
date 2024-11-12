/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task3;

/**
 *
 * @author Clemens
 */
public class Resercher extends AbstractMember{  

    private String name;
    private String researchTopic;

    /**
     *
     * @param name
     * @param researchTopic
     */
    public Resercher(String name, String researchTopic) {
        this.name = name;
        this.researchTopic = researchTopic;
    }
    
    /**
     *
     */
    @Override
    public void printInformation() {
        System.out.println("I am a researcher with the name: " + this.name + " an i research the topic " + this.researchTopic);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getResearchTopic() {
        return researchTopic;
    }

    /**
     *
     * @param researchTopic
     */
    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }
    
    
}
