package Ex_029_execption;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_84_execption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = scanner.nextInt();
try {

    validate(age);
} catch (ArithmeticException | FileNotFoundException e ){
    System.out.println("u can go");

    }
}

static void validate(int age) throws ArithmeticException , FileNotFoundException {
    if (age < 18) {
        throw new ArithmeticException("u cant go to GOA!");
    }
}
}
