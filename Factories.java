import java.util.*;
interface Cycle {
    void ride();
}

class Unicycle implements Cycle {
    public void ride() { System.out.println("Ride Unicycle"); }
}

class Bicycle implements Cycle {
    public void ride() { System.out.println("Ride Bicycle"); }
}

class Tricycle implements Cycle {
    public void ride() { System.out.println("Ride Tricycle"); }
}

interface CycleFactory {
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        System.out.println("Unicycle Factory");
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        System.out.println("Bicycle Factory");
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        System.out.println("Tricycle Factory");
        return new Tricycle();
    }
}

public class Factories {
    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String [] args) {
        rideCycle(new UnicycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}