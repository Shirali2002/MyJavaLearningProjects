package myPatterns.creationalPatterns.abstractFactoryPattern;

public class S20 implements SamsungPhone {
    private String model;
    private String battery;
    private int width;
    private int length;

    public S20(String model, String battery, int width, int length) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.length = length;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "S20{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
