package reflection;

import java.lang.reflect.Field;

public class FieldCopyUtil {

    /**
     * Method to copy properties share between 2 different objects. Objects passed by references.
     * @param from Generic object from the copy is going to be made.
     * @param to Generic object where the copy is going to be made.
     * @throws NoSuchFieldException Not existing field exception.
     * @throws IllegalAccessException Illegal access exception.
     */
    public static void copyPropertiesFromOneObjectToAnother(Object from, Object to) throws NoSuchFieldException, IllegalAccessException {
        Field[] fieldsFrom = from.getClass().getDeclaredFields();
        Field[] fieldsTo = to.getClass().getDeclaredFields();

        for (Field fieldFrom : fieldsFrom) {
            for (Field fieldTo : fieldsTo) {
                if (fieldFrom.getName().equals(fieldTo.getName())) {
                    Field auxFieldFrom = from.getClass().getDeclaredField(fieldFrom.getName());
                    auxFieldFrom.setAccessible(true);
                    Object valueFieldFrom = auxFieldFrom.get(from);
                    Field auxFieldTo = to.getClass().getDeclaredField(fieldTo.getName());
                    auxFieldTo.setAccessible(true);
                    auxFieldTo.set(to, valueFieldFrom);
                }
            }
        }
    }

}
