package creational.singleton;

public class Singleton {

    private String value;

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
