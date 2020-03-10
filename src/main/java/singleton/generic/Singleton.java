package singleton.generic;

public final class Singleton {

    // static variable to store the singleton
    private static Singleton instance;

    // data of each instance
    private String data;

    // set and get for data field/attribute
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // The constructor must be private, so nobody can create instances.
    private Singleton (){
        this.setData("Instance has been created.");
    }

    public static Singleton getInstance() {
        if (instance==null){
            instance = new Singleton();
            instance.setData("Instance has been created and initialized.");
        }
        return instance;
    }

}
