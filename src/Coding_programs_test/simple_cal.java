package Coding_programs_test;

import java.util.Scanner;

public class simple_cal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("simple calculator , ADD , sub, div , multi ");
        System.out.println(" enter the 2 number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("enter the operation");

        char operation= scanner.next().charAt(0);


        switch (operation)
        {
            case '+' :
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                    System.out.println(a*b);
                    break;

            default:
                System.out.println("invaild selection");
                return;

        }

    }
}
