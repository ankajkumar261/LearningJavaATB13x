package Ex_029_execption;

public class Lab_83_trycatch_mulitple {
    public static void main(String[] args) {

        try {
            String s = null ;
            int a ;
            a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("see it again");

        }
        catch (Exception e ){
            System.out.println("see it again 2 ");
        }


    }
}
