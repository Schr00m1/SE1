/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.paymentstrageties;

/**
 *final since we dont want anyone to inherit and change it 
 * @author Clemens
 */
public final class PayPalPayment extends PaymentStragety {
    
    private String eMail;

    /**
     *
     * @param eMail
     */
    public PayPalPayment(String eMail) {
        this.eMail = eMail;
    }
    
    /**
     *
     * @param amount
     */
    @Override
    public void pay(int amount) {
        System.out.println("User is Paying " + amount + " euros using PayPal with the mail" + this.eMail);
    }
    
}
