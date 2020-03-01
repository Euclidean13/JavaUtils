package reflection;

import java.lang.reflect.Field;

public class FieldCopyUtil {

    public static void setFields(Object from, Object to) throws NoSuchFieldException, IllegalAccessException {
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
