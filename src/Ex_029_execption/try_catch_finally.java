package Ex_029_execption;

public class try_catch_finally {
    public static void main(String[] args) {

        int a ;
         try{

             a = 10/0;
         }
         catch (ArithmeticException e){
             System.out.println("u fool");
         }
         finally {
             System.out.println("this one also");
         }


    }
}
