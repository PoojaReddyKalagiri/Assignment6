import java.util.*;
class OuterClass1
{
    void methodOfOuterClass1() {
        System.out.println("From OuterClass1");
    }
    class InnerClass1
    {
        InnerClass1(){}
        InnerClass1(int i){
            i=20;
        }
        int y=10;
    }
}
class OuterClass2 extends OuterClass1
{
    class InnerClass2 extends InnerClass1
    {
      InnerCLass2(){super();}
    }
}
public class InnerClasses
{
    public static void main(String args[])
    {
        OuterClass2 out_obj= new OuterClass2();
        out_obj.methodOfOuterClass1();
        OuterClass2.InnerClass2 in_obj= out_obj.new InnerClass2();
        System.out.println("value accessed from inner class of another class = "+ in_obj.y);
    }
}
