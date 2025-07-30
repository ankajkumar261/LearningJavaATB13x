package iNTERVIEW_PREP;

import java.util.Scanner;

public class tablewithuserinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int a = scanner.nextInt();

        for (int i = 0; i <=10 ; i++) {
            System.out.println(a + " X" +" " + i +"="+ a*i);

        }
    }
}
