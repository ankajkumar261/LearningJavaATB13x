package Ex_025_static;

public class Lab_76_static {
    public static void main(String[] args) {
        A a1 = new A();
        a1.default1();

    }
}


class A {

    void default1(){
        System.out.println("DC");
    }

    static{
        System.out.println("called once");
    }




}