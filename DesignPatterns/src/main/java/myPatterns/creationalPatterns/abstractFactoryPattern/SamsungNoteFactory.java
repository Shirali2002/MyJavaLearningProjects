package myPatterns.creationalPatterns.abstractFactoryPattern;

public class SamsungNoteFactory extends PhoneAbstractFactory{
    @Override
    public SamsungPhone getPhone(String model, String battery, int width, int length) {
        if ("note8".equalsIgnoreCase(model)){
            return new Note8(model, battery, width, length);
        } else if ("note10".equalsIgnoreCase(model)) {
            return new Note10(model, battery, width, length);
        } else {
            throw new RuntimeException("there is no phone model.");
        }
    }
}
