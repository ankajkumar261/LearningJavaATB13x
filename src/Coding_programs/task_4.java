package Coding_programs;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numerical score");
        int num = scanner.nextInt();


        if (num >= 90 && num <= 100){
            System.out.println("A Grade");
        }
        else if(num >= 80 && num <= 89)
        {
            System.out.println("B grade");
        }
        else if(num >= 70 && num <= 79)
        {
            System.out.println("C grade");
        }
        else if(num >= 60 && num <= 69)
        {
            System.out.println("D grade");
        }
        else if (num >= 20 && num <= 59)
        {
            System.out.println("F grade");
        }
        else
        {
            System.out.println("student is nalla");
        }

    }
}
