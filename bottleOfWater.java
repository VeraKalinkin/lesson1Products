public class bottleOfWater extends Product {

    private double volume;

    public double getVolume() {
        return this.volume;
    }

    public bottleOfWater(String name, int cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Объем: " + volume;
    }
}
