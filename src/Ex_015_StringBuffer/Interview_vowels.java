package Ex_015_StringBuffer;

import java.util.Scanner;

public class Interview_vowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name");
        String s = scanner.next();
        s = s.toLowerCase();

        int vowels = 0;
        int constants= 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u' ){
                vowels ++;
            }
            else{
                constants++;
            }

        }
        System.out.println(vowels);
        System.out.println(constants);

    }
}
