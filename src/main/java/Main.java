import services.AnnotationService;
import services.ReflectionService;

public class Main {
    public static void main(String[] args) {
        // Reflection
        // ReflectionService reflectionService = new ReflectionService();
        // reflectionService.reflectionInvocation();

        // Annotation
        AnnotationService annotationService = new AnnotationService();
        annotationService.operateAnnotationAutomaticWeapon();
    }
}
