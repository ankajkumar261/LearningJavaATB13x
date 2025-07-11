package Ex_029_execption;

public class Lab_81_execpiton {
    public static void main(String[] args) {

        System.out.println("Starting the program!");
        String input_user  = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        Integer a = Integer.parseInt(input_user); // java.lang.NumberFormatException
        Integer output = 100/a; // java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the program!");



    }

}
