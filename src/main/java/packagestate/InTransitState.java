package main.java.packagestate;

import main.java.Box;

public class InTransitState implements PackageState {
    @Override
    public void next(Box pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Box pkg) {
        // Previous state handling if applicable
    }

    @Override
    public String printStatus() {
        return "Package is in-transit.";
    }
}
