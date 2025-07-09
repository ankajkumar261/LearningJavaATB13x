package Ex_024_OOPS_interfaces;

public class Lab_74_abstract_interfaces {
}


abstract class incomplete_class{
    int a = 10;

    abstract void display();

    void display1(){
        System.out.println("display1");

    }

}

interface incomplete_interfaces{

    int a =10; // final value

    void display();

    default void display3(){
        System.out.println("display3");
    }

    default void display4(){
        System.out.println("display4");
    }

    static void display5(){
        System.out.println("display5");
    }



}