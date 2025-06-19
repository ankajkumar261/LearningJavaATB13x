package Coding_programs;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scanner.nextInt();


        if (year%400 == 0){
            System.out.println("its a leap year");
        }
        else if(year%100 == 0)
        {
            System.out.println("its not a leap year");
        }
        else if (year%4 == 0){
            System.out.println("its a leap year");
        }
        else
        {
            System.out.println("its not a leap year");
        }


    }
}
