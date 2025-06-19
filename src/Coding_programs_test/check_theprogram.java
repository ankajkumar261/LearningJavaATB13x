package Coding_programs_test;

import java.util.Scanner;

public class check_theprogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int num = scanner.nextInt();

         if (num > 0)
        {
            System.out.println("number is positive");
        }
        else if (num < 0){
            System.out.println("number is negative");
        }
        else {
             System.out.println("number is zero");
        }

    }
}
