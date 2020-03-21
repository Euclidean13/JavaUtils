package annotations.dependencyInyection;

public class Inject {
    private String somethingToReturn = "'Something back from the injected object'";

    public String injectMethod() {
        return somethingToReturn;
    }
}
