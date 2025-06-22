package Ex_014_functions;

public class Lab_48_fun {
    public static void main(String[] args) {

        wp_wr_greet();
        without_p_with_r();
        greet_with_details(4,5);

        System.out.println(sum(3,4,5));

    }

    static void wp_wr_greet(){
        System.out.println("without parameter and without return type");
    }

    static int without_p_with_r(){
        System.out.println("without parameter but with return");
        return 0 ;
    }

    static void greet_with_details(int a , int b){
        System.out.println(a+b);
    }

    static int sum(int a , int b , int c){
        System.out.println("sum of three numbers");
        return a+b+c;
    }

}
