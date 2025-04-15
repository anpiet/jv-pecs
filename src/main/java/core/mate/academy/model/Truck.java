package core.mate.academy.model;

public class Truck extends Machine {

    private int capacityInTons;

    public Truck() {
    }

    public Truck(int capacityInTons) {
        this.capacityInTons = capacityInTons;
    }

    @Override
    public void doWork() {
        System.out.println("Truck with capacity " + capacityInTons + " started to work");
    }
}
