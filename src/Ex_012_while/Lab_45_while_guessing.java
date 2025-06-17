package Ex_012_while;

import java.util.Random;
import java.util.Scanner;

public class Lab_45_while_guessing {
    public static void main(String[] args) {

        Random random = new Random();
        int guessnumber = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int guess = 0;
        int attempts = 0;

        while (true){
            guess = scanner.nextInt();
            attempts++;
        if(guess < guessnumber){
            System.out.println("number to too low");
        }
        else if (guess > guessnumber){
            System.out.println("number is too high");
        }
          else {
            System.out.println("correct answer ->" + attempts +"attempts" );
         }
        }

    }
}
