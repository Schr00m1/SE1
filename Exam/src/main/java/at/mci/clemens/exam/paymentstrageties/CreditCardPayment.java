/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.exam.paymentstrageties;

/**
 *
 * @author Clemens
 */
public final class CreditCardPayment extends PaymentStragety {
    private int cardNumber;

    public CreditCardPayment(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("User is Paying " + amount + " euros using Credit Card with the card number " + this.cardNumber);
    }
    
}
