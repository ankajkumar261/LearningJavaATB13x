package Ex_017_Arrays_2;

import java.util.Scanner;

public class Lab_58_star {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }


}
