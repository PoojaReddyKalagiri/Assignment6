public class Cycle {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{
                new Cycle(), new Unicycle(),
                new Bicycle(), new Tricycle()
        };
        for (Cycle c : cycles) {
            c.ride();
            /*((Unicycle) c).balance();
            Exception in thread "main" java.lang.ClassCastException: Cycle cannot be cast to Unicycle
	        at Cycle.main(Cycle.java:9)*/
        }
    }

    void ride() {
        System.out.println("Cycle.ride()");
    }
}

class Unicycle extends Cycle {
    void ride() {
        System.out.println("Unicycle.ride()");
    }
    void balance() {
        System.out.println("Unicycle.balance()");
    }
}

class Bicycle extends Cycle {
    void ride() {
        System.out.println("Bicycle.ride()");
    }
    void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    void ride() {
        System.out.println("Tricycle.ride()");
    }
}