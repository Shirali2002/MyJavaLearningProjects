package myPatterns.creationalPatterns.factoryMethodPattern;

public class PhoneFactory {
    public static Phone getPhone(String model, String battery, int width, int length){
        Phone phone;
        if ("s8".equalsIgnoreCase(model)){
            phone = new S8(model, battery, width, length);
        } else if ("note8".equalsIgnoreCase(model)){
            phone = new Note8(model, battery, width, length);
        } else {
            throw new RuntimeException("there is no phone model");
        }

        return phone;
    }
}
