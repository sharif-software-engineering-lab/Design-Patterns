package main.java.shippingstrategy;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double packageWeight) {
        // Assume standard rate is 2.5 per weight unit
        return packageWeight * 2.5;
    }
}
