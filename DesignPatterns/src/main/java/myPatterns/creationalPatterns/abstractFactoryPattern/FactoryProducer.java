package myPatterns.creationalPatterns.abstractFactoryPattern;

public class FactoryProducer {
    public static PhoneAbstractFactory getFactory(String modelSeries){
        if ("s".equalsIgnoreCase(modelSeries)){
            return new SamsungSFactory();
        } else if ("note".equalsIgnoreCase(modelSeries)) {
            return new SamsungNoteFactory();
        } else {
            throw new RuntimeException("there is no this model series.");
        }
    }
}
