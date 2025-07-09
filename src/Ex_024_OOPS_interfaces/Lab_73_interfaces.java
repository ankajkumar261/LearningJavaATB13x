package Ex_024_OOPS_interfaces;

public class Lab_73_interfaces {
    public static void main(String[] args) {

        rectangle r1 = new rectangle();
        r1.getArea(3,5);

    }
}


class rectangle implements polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of rectangle"+ "  " + 3.14 * length * breadth);
    }
}


interface polygon{

   void getArea(int length , int breadth);


   default void complete1(){

       System.out.println("this is possible");
   }

   default void complete2(){

       System.out.println(" this is als possible");
   }

}
