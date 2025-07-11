package Ex_029_execption;

public class Lab_83_throw {
    public static void main(String[] args) {
a1(0);
    }


static void a1(int a ){
    if (a == 0)
    throw new ArithmeticException("a will be never zero");

    }
}