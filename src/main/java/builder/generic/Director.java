package builder.generic;

public class Director {

    private IBuilder builder;

    public Director() {
    }

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(IBuilder builder) {
        this.builder = builder;
    }

    public void make(String type){
        builder.reset();
        if (type=="Product1") {
            builder.buildStepA();
        } else if (type=="Product2") {
            builder.buildStepB();
            builder.buildStepZ();
        }
    }

}
