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
public class CashStrategy implements PaymentStrategy{

    @Override
    public void pay(double price) {
        System.out.println(" Pay by cash" + price);
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
