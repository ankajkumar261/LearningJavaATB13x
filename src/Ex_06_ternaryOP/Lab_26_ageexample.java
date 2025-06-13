package Ex_06_ternaryOP;

public class Lab_26_ageexample {
    public static void main(String[] args) {
        int age = 20;
        String canmakeVOTE = age < 18 ? "Minor" : age > 25 ? " adult" : "senior";
        System.out.println(canmakeVOTE);
    }
}
