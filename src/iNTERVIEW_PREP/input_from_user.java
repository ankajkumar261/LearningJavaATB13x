package iNTERVIEW_PREP;

import java.util.Scanner;

public class input_from_user {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = scanner.nextInt();


        if(age>18){
            System.out.println("valid for vote");
        }
        else {
            System.out.println("not valid for vote");
        }



    }
}
