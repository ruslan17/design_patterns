package creational.singleton;

public class Client {

    public static void main(String[] args) {
        Singleton singleton1 =
                Singleton.getInstance();

        singleton1.setValue("VAL 1");

        Singleton singleton2 =
                Singleton.getInstance();

        String value = singleton2.getValue();
        System.out.println(value);

    }

}
