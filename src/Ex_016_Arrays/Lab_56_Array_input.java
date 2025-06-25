package Ex_016_Arrays;

import java.util.Scanner;

public class Lab_56_Array_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int size = sc.nextInt();

        int []marks = new int[size];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter the numbers");
            marks[i]= sc.nextInt();

        }

        System.out.println("printing the elements ");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }


    }
}
