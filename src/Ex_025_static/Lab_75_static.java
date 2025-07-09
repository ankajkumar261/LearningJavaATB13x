package Ex_025_static;

public class Lab_75_static {
    public static void main(String[] args) {

        a c1= new a();
        System.out.println(c1.b);
        System.out.println(c1.a);

    }
}




class a {

    int a = 0;

    static int b = 10;

    void display(){
        System.out.println("display1");
    }




}