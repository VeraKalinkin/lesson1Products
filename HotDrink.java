public class HotDrink extends bottleOfWater{
    private int temperature;

    public HotDrink(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Температура: " + temperature;
    }
}
