package myPatterns.creationalPatterns.abstractFactoryPattern;

public class SamsungSFactory extends PhoneAbstractFactory{
    @Override
    public SamsungPhone getPhone(String model, String battery, int width, int length) {
        if ("s8".equalsIgnoreCase(model)){
            return new S8(model, battery, width, length);
        } else if ("s20".equalsIgnoreCase(model)) {
            return new S20(model, battery, width, length);
        } else {
            throw new RuntimeException("there is no phone model.");
        }
    }
}
