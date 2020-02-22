package builder.generic;

public class Client {

    public static void main(String args[]){
        ConcreteBuilder1 c1 = new ConcreteBuilder1();
        Director d = new Director();

        d.setBuilder(c1);
        d.make("product1");
        Product1 p = c1.getResult();
    }
}
