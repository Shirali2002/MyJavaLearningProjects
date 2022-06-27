package myPatterns.creationalPatterns.factoryMethodPattern;

public class Note8 implements Phone{
    private String model;
    private String battery;
    private int width;
    private int length;

    public Note8(String model, String battery, int width, int length) {
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
        return "Note8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
