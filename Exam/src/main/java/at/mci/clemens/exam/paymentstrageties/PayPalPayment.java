/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.paymentstrageties;

/**
 *
 * @author Clemens
 */
public final class PayPalPayment extends PaymentStragety {
    
    private String eMail;

    public PayPalPayment(String eMail) {
        this.eMail = eMail;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("User is Paying " + amount + " euros using PayPal with the mail" + this.eMail);
    }
    
}
