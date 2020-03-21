package annotations.dependencyInyection;

public class NeedsTheInjectedObject {

    @Autowired
    private Inject inject;

    public void useInjectedObjectAndPrintOut() {
         String textFromTheInjectedObject = inject.injectMethod();
        System.out.println("What the injected object returns is: " + textFromTheInjectedObject);
    }

}
