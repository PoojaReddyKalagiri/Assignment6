interface I1{
    void u();
    void v();
}

interface I2{
    void w();
    void x();
}

interface I3{
    void y();
    void z();
}

interface I4 extends I1, I2, I3{
    void xyz();
}

class Concrete_Class{
    private int i = 0;
    public void method() {}
}

class C extends Concrete_Class implements I4 {
    private int j = 0;
    public void u() {}
    public void v() {}
    public void w() {}
    public void x() {}
    public void y() {}
    public void z() {}
    public void xyz() {}
}

public class Three_Interfaces {
    public static void m1(I1 obj1) { obj1.v(); }
    public static void m2(I2 obj2) { obj2.w(); }
    public static void m3(I3 obj3) { obj3.y(); }
    public static void m4(I4 obj4) { obj4.xyz(); }
    public static void main(String[] args) {
        C obj = new C();
        m1(obj);
        m2(obj);
        m3(obj);
        m4(obj);
    }
}