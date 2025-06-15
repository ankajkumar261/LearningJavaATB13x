package Ex_08_increment_decrment;

public class Lab_32_advanceID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);


//        5 / 10 / ?
//        6/ 11/ 11+12 ->23

        int b = 1;
        System.out.println(b++ + ++b);

//        12/ 1/?            b++ -> b -> EXP b -> 2
//                              +
//        13 / 1 /4          b++ -> B -> EXP B -> 4
    }
}
