package services;

import reflection.FieldCopyUtil;
import reflection.models.A;
import reflection.models.B;

public class ReflectionService {

    public void reflectionInvocation() {
        A a = new A();
        B b = new B();
        a.setA1("aaaa");
        a.setA2("ssss");
        a.setA3("dddd");
        try {
            FieldCopyUtil.copyPropertiesFromOneObjectToAnother(a, b);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(b.getB1());
        System.out.println(b.getB2());
        System.out.println(b.getA3());
        System.out.println(b.getA2());
    }
}
