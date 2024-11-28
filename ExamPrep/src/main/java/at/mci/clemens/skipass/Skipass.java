/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.skipass;

/**
 *
 * @author Clemens
 */
public abstract class Skipass {
    private long seriennummer;
    private int anfangGueltigkeit;
    private int anzahlTage;
    private double price;

    public boolean istGueltig(int day){
        if(day > this.anfangGueltigkeit){
            return (day <= this.anfangGueltigkeit+day);
        }else{
            int dayLeftinYear = this.anfangGueltigkeit - 365;
            return this.anzahlTage - dayLeftinYear >= day;
    }
}
            
    
    public long getSeriennummer() {
        return seriennummer;
    }

    public void setSeriennummer(long seriennummer) {
        this.seriennummer = seriennummer;
    }

    public int getAnfangGueltigkeit() {
        return anfangGueltigkeit;
    }

    public void setAnfangGueltigkeit(int anfangGueltigkeit) {
        this.anfangGueltigkeit = anfangGueltigkeit;
    }

    public int getAnzahlTage() {
        return anzahlTage;
    }

    public void setAnzahlTage(int anzahlTage) {
        this.anzahlTage = anzahlTage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Skipass Nr " + this.seriennummer + "  gilt ab " + this.anfangGueltigkeit + " bis " + this.anzahlTage +  " und kostete " + this.price; 
    }
    
    
    
    
}
