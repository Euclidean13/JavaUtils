import annotations.dependencyInyection.NeedsTheInjectedObject;
import services.AnnotationService;
import services.ReflectionService;
import services.SpringSimulator;

public class Main {
    public static void main(String[] args) {
        // Reflection
        // ReflectionService reflectionService = new ReflectionService();
        // reflectionService.reflectionInvocation();

        // Annotation
        // AnnotationService annotationService = new AnnotationService();
        // annotationService.operateAnnotationAutomaticWeapon();

        // Spring simulator using Autowired
        SpringSimulator springSimulator = new SpringSimulator();
        NeedsTheInjectedObject needsTheInjectedObject = new NeedsTheInjectedObject();
        /** Spring makes it a little easier to instantiate the objects and not need to ask for the injection to an
         * object itself, for simplicity we will ask for the injection directly */
        springSimulator.objectInjector(needsTheInjectedObject);
        needsTheInjectedObject.useInjectedObjectAndPrintOut();
    }
}
