/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mci.sweng1.andrea.observer;


/**
 *
 * @author Andrea
 */
public class Client {

    public static void main(String[] args) {
        Workplace w = new Workplace();
        Municipality m = new Municipality();
        University u = new University();
        School s = new School();
        
        Person chiara = new Person("Chiara","Germany",MaritalStatus.UNMARRIED),
               lara = new Person("Lara","Germany",MaritalStatus.UNMARRIED),
               giuliana = new Person("Giuliana","Italy",MaritalStatus.MARRIED),
               elisa = new Person("Elisa","Denmark",MaritalStatus.UNMARRIED);
        
        // Chiara is a student at the University
        chiara.register(u);  // register observer
        // Lara works
        lara.register(w);  // register observer
        // Giuliana is a pensionist
        giuliana.register(m);  //register observer
        // Elisa is a schoolgirl
        elisa.register(s);  //register observer
        
        // Lara gets married
        lara.setPrivacySetting(false);
        lara.changeMaritalStatusInto(MaritalStatus.MARRIED);
        // Chiara changed her name as "Chiara Lilia"
        chiara.setPrivacySetting(false);
        chiara.changeNameInto("Chiara Lilia");
        // Elisa moved to Italy; no privacy concern
        elisa.setPrivacySetting(false);
        elisa.changeAddressInto("Italy");
        // Giuliana moved to a new address
        giuliana.setPrivacySetting(false);
        giuliana.changeAddressInto("via della Luna");

    }

}
