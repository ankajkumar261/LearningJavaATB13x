package Ex_015_StringBuffer;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class palandrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word");
        String new_string = scanner.next();

        String reversed = reverseString(new_string);

        if(reversed.equalsIgnoreCase(new_string))
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }

    static String reverseString (String userInput){
        String reversed ="";
        for (int i = userInput.length()-1; i >=0 ; i--) {
            reversed = reversed + userInput.charAt(i);


        }
        return reversed;

    }

}
