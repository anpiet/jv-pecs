package core.mate.academy.model;

public class Bulldozer extends Machine {

    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work with blade width: " + bladeWidth);
    }
}
