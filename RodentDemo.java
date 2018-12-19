import java.util.*;
abstract class Rodent
{
    abstract void eat();
    abstract void run();
}
class Mouse extends Rodent
{
    Mouse(){
        System.out.println("This is Mouse Class");
    }
    void eat()
    {
        System.out.println("Mouse is eating");
    }
    void run()
    {
        System.out.println("Mouse is running");
    }
}
class Gerbil extends Rodent
{
    Gerbil(){
        System.out.println("This is Gerbil Class");
    }
    void eat()
    {
        System.out.println("Gerbil is eating");
    }
    void run()
    {
        System.out.println("Gerbil is running");
    }
}
class Hamster extends Rodent
{
    Hamster(){
        System.out.println("This is Hamster Class");
    }
    void eat()
    {
        System.out.println("Hamster is eating");
    }
    void run()
    {
        System.out.println("Hamster is running");
    }
}
public class RodentDemo
{
    public static void main(String args[])
    {
        Rodent r[] = new Rodent[3];
        r[0] = new Mouse();
        r[1] = new Gerbil();
        r[2] = new Hamster();

        r[0].eat();
        r[0].run();

        r[1].eat();
        r[1].run();

        r[2].eat();
        r[2].run();
    }
}
