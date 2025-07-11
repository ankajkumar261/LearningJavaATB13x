package Ex_029_execption;

public class new_try_catch {
    public static void main(String[] args) {


        int a ;

        try {
            a= 10/0;
        } catch (ArithmeticException e) {
            System.out.println("you fool");
        }
        catch (Exception e){
            System.out.println("you too fool");
        }

        System.out.println("2nd value excuted");


    }
}
