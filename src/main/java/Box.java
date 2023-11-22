package main.java;

import main.java.shippingstrategy.*;
import main.java.packagestate.*;


public class Box {
    private final double weight;
    private ShippingStrategy shippingStrategy;
    private PackageState state;


    public Box(double weight) {
        this.weight = weight;
        this.shippingStrategy = new StandardShipping(); // Default strategy
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost() {
        return shippingStrategy.calculateShippingCost(weight);
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public String getStatus() {
        return state.printStatus();
    }
}
