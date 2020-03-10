package singleton.generic;

public class Client {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println("Data in singleton: " + instance.getData());

        // code does not compile:
        // "Singleton()" has private access in "singleton.generic.Singleton"
//        Singleton anotherInstance = new Singleton();
    }
}
