package myPatterns.creationalPatterns.singletonPattern;

public class SingletonClass {
    private static SingletonClass singleton;

    static {
        singleton = new SingletonClass();
    }

    private SingletonClass(){
        System.out.println("object created.");
    }

    public static SingletonClass getSingletonBestPractise(){
        return singleton;
    }


/*    public static SingletonClass getSingleton(){

        if (singleton == null) {
            synchronized (SingletonClass.class) {
                if (singleton == null) {
                    singleton = new SingletonClass();
                }
            }
        }


        return singleton;
    }*/
}
