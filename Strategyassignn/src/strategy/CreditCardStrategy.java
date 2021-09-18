/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class CreditCardStrategy implements PaymentStrategy{
    private final String nameOfCard;
    private final String number;
    private final int expirationYear;
    private final int cvv;

    public CreditCardStrategy(String nameOfCard, String number, int expirationYear, int cvv) {
        this.nameOfCard = nameOfCard;
        this.number = number;
        this.expirationYear = expirationYear;
        this.cvv = cvv;
    }

    @Override
    public void pay(double price) {
        System.out.println("You will pay price: "+ price+" with" +this);
        
       
    }

    @Override
    public String toString() {
        return "CreditCardStrategy{" + "nameOfCard=" + nameOfCard + ", number=" + number + ", expirationYear=" + expirationYear + ", cvv=" + cvv + '}';
    }
    
    
    
    
            
    
    
}
