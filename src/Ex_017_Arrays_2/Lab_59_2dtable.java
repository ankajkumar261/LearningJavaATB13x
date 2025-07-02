package Ex_017_Arrays_2;

import java.util.Scanner;

public class Lab_59_2dtable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int table = scanner.nextInt();

        for (int i = 0; i < table; i++) {
            for (int j = 0; j < table; j++) {
                System.out.print(i*j + "   |   ");

            }
            System.out.println();

        }

    }
}
