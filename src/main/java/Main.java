import reflection.FieldCopyUtil;
import reflection.models.A;
import reflection.models.B;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Reflection
        A a = new A();
        B b = new B();
        a.setA1("aaaa");
        a.setA2("ssss");
        a.setA3("dddd");
        FieldCopyUtil.copyPropertiesFromOneObjectToAnother(a, b);
        System.out.println(b.getB1());
        System.out.println(b.getB2());
        System.out.println(b.getA3());
        System.out.println(b.getA2());
    }
}
