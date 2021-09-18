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
public enum Color {
    PINK(1),
    BLUE(2),
    YELLOW(3),
    RED(4),
    ORANGE(5),
    GREEN(6),
    INDIGO(7),
    VIOLET(8);
    
    
    private final int colorPrice;

    private Color(int colorPrice) {
        this.colorPrice = colorPrice;
    }

    public int getcolorPrice() {
        return colorPrice;
    }

  





}






