package Ex_029_execption;

public class try_catch {
    public static void main(String[] args) {

        int a ;

        try {
            a = 10/0;
        }
        catch (ArithmeticException e ){
            System.out.println(e.getMessage());
        }

        System.out.println("this also excutes");




    }
}
