package main.java.packagestate;

import main.java.Box;

public interface PackageState {
    void next(Box pkg);
    void prev(Box pkg);
    String printStatus();

}
