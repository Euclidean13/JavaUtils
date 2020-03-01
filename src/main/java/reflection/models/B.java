package reflection.models;

public class B {

    private String b1;
    private String b2;
    private String a3;
    private String a2;

    public B() {
    }

    public B(String b1, String b2, String a3, String a2) {
        this.b1 = b1;
        this.b2 = b2;
        this.a3 = a3;
        this.a2 = a2;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }
}
