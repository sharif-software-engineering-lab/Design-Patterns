package main.java.shippingstrategy;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double packageWeight) {
        // Assume express rate is 3.5 per weight unit
        return packageWeight * 3.5;
    }
}
