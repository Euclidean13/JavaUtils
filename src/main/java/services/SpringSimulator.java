package services;

import annotations.dependencyInyection.Autowired;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class SpringSimulator {

    public void objectInjector (final Object objectThatNeedsInjection) {
        Class<?> classOfTheObjectThatNeedsInjection = objectThatNeedsInjection.getClass();

        final Field[] variables = classOfTheObjectThatNeedsInjection.getDeclaredFields();
        for (final Field variable : variables) {
            final Annotation annotationFetched = variable.getAnnotation(Autowired.class);

            if (annotationFetched != null && annotationFetched instanceof Autowired) {
                // Get the type of the class to inject, regardless the type
                Class<?> classToInject = variable.getType();

                try {
                    // Instantiate the object to be injected
                    Object newObjectOfMyClass = classToInject.getConstructor().newInstance();

                    variable.setAccessible(true); // Let also private variables

                    // Inject the object in the variable of the required object
                    variable.set(objectThatNeedsInjection, newObjectOfMyClass);

                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
