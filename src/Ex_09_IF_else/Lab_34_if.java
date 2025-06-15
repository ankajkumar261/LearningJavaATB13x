package Ex_09_IF_else;

import java.util.Scanner;

public class Lab_34_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age for vote");
        int age = sc.nextInt();

        if (age > 18)
        {
            System.out.println("he is allowed to vote");
        }
        else{
            System.out.println("he is not allowed to vote");
        }
    }
}
