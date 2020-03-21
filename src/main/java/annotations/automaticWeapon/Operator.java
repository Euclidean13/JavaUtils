package annotations.automaticWeapon;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Reading the annotation in execution time using reflection
 */
public class Operator {

    public void operate(AutomaticWeapon weapon) throws InvocationTargetException, IllegalAccessException {
        final String className = weapon.getClass().getName();
        try {
            final Method[] methods = Class.forName(className).getMethods();
            for (final Method method : methods) {
                invokeMethod(method, weapon);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("There was an error: " + e.getMessage());
        }
    }

    private void invokeMethod(Method method, AutomaticWeapon weapon) throws InvocationTargetException,
            IllegalAccessException {

        final MultipleInvocation multipleInvocation = method.getAnnotation(MultipleInvocation.class);

        if (multipleInvocation != null) {
            final int timesToInvoke = multipleInvocation.timesToInvoke();

            for (int i = 0; i < timesToInvoke; i++) {
                method.invoke(weapon, (Object[])null);
            }
        }
    }

}
