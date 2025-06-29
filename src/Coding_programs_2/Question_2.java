package Coding_programs_2;

public class Question_2 {
    public static void main(String[] args) {


        String s1= "Hello";
        String s2= "hello";
        String s3= "Hello";

        System.out.println("equals to strings");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("equal to ingorecase");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));

        System.out.println("compare it");
        System.out.println(s1.compareTo(s2));

    }
}
