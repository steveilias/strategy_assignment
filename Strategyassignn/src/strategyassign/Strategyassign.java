/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassign;


import strategy.*;

/**
 *
 * @author eliaspanagiotopoulos
 */
public class Strategyassign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 1. Find tshirts
        Tshirt t1 = new Tshirt("tshirt1", Color.GREEN, Fabric.Cotton, Size.Large, 100.10);
        Tshirt t2 = new Tshirt("tshirt1", Color.INDIGO, Fabric.Cotton, Size.Large, 100.10);
         Tshirt t3 = new Tshirt("tshirt1", Color.YELLOW, Fabric.Cotton, Size.Large, 300.10);
//2. find tshirts
        Cart cart = new Cart();
        cart.addTshirt(t1);
        cart.addTshirt(t2);
       // cart.addTshirt(t3);
        
        
        System.out.println("total price to pay:"+cart.getTotalPrice());           
        
        //3. welcome to cashier
     PaymentStrategy strategy;
        if(cart.getTotalPrice()<50){
            
            strategy= new CashStrategy();
        }else if (cart.getTotalPrice()<150){
        
        
        strategy= new CreditCardStrategy("mastercard","12345667", 2021,145);
        
        }else {
                
                strategy= new BankTransferStrategy("eurobank","123456");
                }
        cart.setStrategy(strategy);
        cart.payTotal();
    }

}
