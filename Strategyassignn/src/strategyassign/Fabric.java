/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassign;

/**
 *
 * @author eliaspanagiotopoulos
 */
public enum Fabric {
    Cotton(1),
    WOOL(2) ,
    LINEN(3),
    SILK(4),
    CASHMERE(5);
    
    
    
    private final int price;
    
    Fabric(int price){
        this.price=price;
    }
    
   public int getPrice(){
       return price;
       
   }
  }
