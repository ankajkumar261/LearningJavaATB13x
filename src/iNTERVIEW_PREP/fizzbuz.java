package iNTERVIEW_PREP;

public class fizzbuz {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if(i % 3 == 0 || i % 5 ==0){
                System.out.println("fizzBuzz" + i);
            }
            else if(i%3 == 0){
                System.out.println("fizz"+ i);
            }
            else if(i%5 == 0){
                System.out.println("buzz"+ i);
            }
            else {
                System.out.println(i);
            }
        }

    }
}
