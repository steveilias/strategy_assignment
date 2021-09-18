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
public enum Size {
    Small(1),
    Medium(2),
    Large(3),
    XL(4),
    XXL(5);

    private final int price;

    
        Size (int price){
            this.price=price;
        }
    public int getPrice() {
        return price;
    }

    
}
