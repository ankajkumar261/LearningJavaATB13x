package Ex_012_while;

import java.awt.*;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name ");
        String sc = scanner.next();

        int vowel = 0;
        int constant = 0;

        for (int i = 0; i < sc.length() ; i++) {
            char ch = sc.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                vowel++;
            }
            else {
                constant++;
            }

        }

        System.out.println("vowels" + vowel);
        System.out.println("constant"  + constant);


    }
}
