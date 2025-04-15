package core.mate.academy.model;

public class Excavator extends Machine {

    private int armLength;

    public Excavator() {
    }

    public Excavator(int armLength) {
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work with arm length: " + armLength);
    }
}
