package myPatterns.creationalPatterns.singletonPattern;

public class SingletonClass {
    private static SingletonClass singleton;

    private static int count = 0;

    private SingletonClass(){
        System.out.println("object created.");
    }

    public static SingletonClass getSingleton(){

        if (singleton == null) {
            synchronized (SingletonClass.class) {
//                if (singleton == null) {
                    singleton = new SingletonClass();
//                }
            }
        }

        count++;
        System.out.println(count);

        return singleton;
    }
}
