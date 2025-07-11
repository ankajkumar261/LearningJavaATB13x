package Ex_030_Generics;

public class Lab_85_generics {
    public static void main(String[] args) {

        int s = sum(2,4);
        System.out.println(s);

    }




        static int sum ( int a, int b){
            System.out.println("adding the two number");
            return a + b;
        }

        static double sum(int a , int b, int c){
            System.out.println("adding the two number_double");
            return a + b ;
        }


}
