package main.java.packagestate;

import main.java.Box;

public class DeliveredState implements PackageState {
    @Override
    public void next(Box pkg) {

    }

    @Override
    public void prev(Box pkg) {
        pkg.setState(new InTransitState());
    }

    @Override
    public String printStatus() {
        return "Package is delivered.";
    }
}
