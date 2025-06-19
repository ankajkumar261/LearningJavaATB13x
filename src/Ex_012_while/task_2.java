package Ex_012_while;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word");

        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(ch + "-> " +"vowel");
        }
        else if ( ch >= 'a' && ch <= 'z')
        {
            System.out.println(ch +  " consonant");
        }
        else{
            System.out.println("invalid char!");
        }
    }
}
