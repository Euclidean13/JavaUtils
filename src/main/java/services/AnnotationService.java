package services;

import annotations.automaticWeapon.AutomaticWeapon;
import annotations.automaticWeapon.Operator;

import java.lang.reflect.InvocationTargetException;

public class AnnotationService {

    public void operateAnnotationAutomaticWeapon() {
        final AutomaticWeapon weapon = new AutomaticWeapon(20);
        final Operator operator = new Operator();
        try {
            operator.operate(weapon);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
