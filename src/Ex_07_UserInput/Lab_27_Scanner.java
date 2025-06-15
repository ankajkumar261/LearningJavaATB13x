package Ex_07_UserInput;

import java.util.Scanner;

public class Lab_27_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");

        int age = scanner.nextInt();
        String s= age >= 18 ? "yes " : "no";
        System.out.println(s);

    }

}
