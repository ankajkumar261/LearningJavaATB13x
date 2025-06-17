package Ex_012_while;

import java.util.Scanner;

public class Lab_44_factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial number");
        int num= sc.nextInt();

        int factorial = 1;

        if (num < 0)
        {
            System.out.println("neagtive are not allowed");
            return;
        }

        if (num <= 0){
            System.out.println(factorial);
        }
        else{
            for (int i = 1; i <= num ; i++) {
                factorial = factorial*i;
            }
        }
        System.out.println("factorial number -> " + factorial);

    }
}
