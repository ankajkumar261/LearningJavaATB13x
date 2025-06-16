package Ex_09_IF_else;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("enter the three triangle sides ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//      check if are sides are epual
        if (a == b && a == c){
            System.out.println("all the triangles sides are epual");
        }
        else if (a==b || a==c || b==c) {
            System.out.println("two sides are equal");

        }
        else {
            System.out.println("no side are eqaul");
        }

    }
}
