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
public class Tshirt {

    private String name;
    private Color color;
    private double price;
    private Fabric fabric;
    private Size size;

   

    public Tshirt(String name, Color color, Fabric fabric, Size size, double price ) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.fabric = fabric;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double CalculatePrice(Tshirt tshirt, double price) {
        this.price = tshirt.getColor().getcolorPrice() ;
        this.price += tshirt.getFabric().getPrice();
        this.price += tshirt.getSize().getPrice();
        return price;
    }
}
