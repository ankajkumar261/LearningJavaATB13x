package Coding_programs_test;

import java.util.Scanner;

public class largest_num {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the three number");

        int a = scanner.nextInt();
        int b =scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("checking which number is greater");

        if(a > b && a > c){
            System.out.println("a is greater" +" "+ a);
        }
        else if( b > a && b > c)
        {
            System.out.println("b is greater" +" "+ b);
        }
        else {
            System.out.println("c is grater " + c);
        }
    }
}
