/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.skipass;

import at.mci.clemens.skipass.SeriennummerCreator;
/**
 *
 * @author Clemens
 */
public class SkipassKassa {
    public Skipass kaufen(int AlterInhaber, int vonTag, int anzahlTage){
            if(vonTag > 365 || anzahlTage > 365 ){
                System.out.println("Wrong number of Days given");
                return null;
             }else{
                double rabatt = 0;
                if(anzahlTage >= 21){
                    rabatt = 30;
                }else if(anzahlTage >= 7){
                    rabatt = 20;
                }else if(anzahlTage >= 3){
                    rabatt = 10;
                }
                double price =  0;
                Skipass pass;
                if (AlterInhaber >= 65){
                    price = 30;
                    pass = new RentnerPass();
                }else if (AlterInhaber >= 18){
                    price = 40; 
                    pass = new ErwachsenerPass();
                }else{
                    price  = 25;
                    pass = new KindPass();
                }
                rabatt /= 100;
                price *= anzahlTage;
                price *= rabatt;
                
                long id = SeriennummerCreator.seriennummerCreatorInstance.createId();
                pass.setSeriennummer(id);
                pass.setAnfangGueltigkeit(vonTag);
                pass.setAnzahlTage(anzahlTage);
                pass.setPrice(price);
                return pass;
            }
    }
}
