package Ex_026_IIB;

public class Lab_77_IIB {
    public static void main(String[] args) {
        A a1= new A();
        System.out.println(a1.a);
    }
}


class A {

    int a = 10;

    {

        System.out.println("this one IIB");

    }


    {

        System.out.println("this one 2nd IIB");
    }

}