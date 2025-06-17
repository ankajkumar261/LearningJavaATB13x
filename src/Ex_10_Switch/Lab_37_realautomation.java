package Ex_10_Switch;

import java.util.Scanner;

public class Lab_37_realautomation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter which browser you want to use");
        String broswer = sc.next();
        broswer =broswer.toLowerCase();

        switch (broswer) {
            case "chrome": {
                System.out.println("staring the chrome");
                System.out.println("tc1");
                System.out.println("tc2");
                System.out.println("....");
                break;
            }
            case "firefox": {
                System.out.println("executing the testcase on fire fox");
                break;
            }
            case "edge": {
                System.out.println("executing the testcase on edge");
                break;
            }

            default: {
                System.out.println("no browser found");
            }
        }

    }
}
