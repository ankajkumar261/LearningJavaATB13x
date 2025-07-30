package iNTERVIEW_PREP;

import java.util.Scanner;

public class gradeCal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();

        if(num >= 90 && num <= 100){
            System.out.println("A");
        }
        else if(num >= 80 && num <= 89){
            System.out.println("B");
        }
        else if(num >= 70 && num <= 79){
            System.out.println("c");
        }
        else
        {
            System.out.println("failure");
        }






    }
}
