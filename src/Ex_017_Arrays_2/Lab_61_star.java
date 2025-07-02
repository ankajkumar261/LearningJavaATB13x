package Ex_017_Arrays_2;

import java.util.Scanner;

public class Lab_61_star {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the star number to print ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i ; k++) {
                System.out.print("*");
            }
            for (int m = 2; m < i ; m++) {
                System.out.print("*");

            }
            System.out.println();
            
        }


    }

}
