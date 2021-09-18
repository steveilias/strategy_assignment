/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassign;

import java.util.ArrayList;
//import strategy.BankTransfer;
import strategy.PaymentStrategy;
import java.util.List;


/**
 *
 * @author eliaspanagiotopoulos
 */
public class Cart implements PaymentStrategy {

   private List<Tshirt> tshirts;
   private PaymentStrategy strategy;

 
    
   public List<Tshirt> getTshirts(){
       return tshirts;
   }
   
   
    public void addTshirt(Tshirt tshirt){
        if(tshirts==null){
        tshirts=new ArrayList();
        }
        tshirts.add(tshirt);
        
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    
    public void payTotal(){
        double total= getTotalPrice();
        strategy.pay(total);
    }

    
        public double getTotalPrice(){
            double price=0;
            for(Tshirt tshirt:getTshirts()){
                price+= tshirt.getPrice();
            }
            
        return price;
        }
        
       
      
    
    
    @Override
    public void pay(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    

}
