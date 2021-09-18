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
public class BankTransferStrategy implements PaymentStrategy {

    private final String bank;
    private final String accounNumber;
    private PaymentStrategy strategy;

    public BankTransferStrategy(String bank, String accounNumber) {
        this.bank = bank;
        this.accounNumber = accounNumber;
    }

    @Override
    public void pay(double price) {

        System.out.println("You will pay price " + price + "by cash " + this);

      
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return "BankTransferStrategy{" + "bank=" + bank + ", accounNumber=" + accounNumber + '}';
    }

}
