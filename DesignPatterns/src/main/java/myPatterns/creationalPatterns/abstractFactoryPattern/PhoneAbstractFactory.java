package myPatterns.creationalPatterns.abstractFactoryPattern;

public abstract class PhoneAbstractFactory {
    public abstract SamsungPhone getPhone(String model, String battery, int width, int length);
}
