package Ex_020_OOPS_polymorphism_methodoverloading.methodoverloading;

public class Lab_68_overload {
    public static void main(String[] args) {
        cals cals1 = new cals();
        System.out.println(cals1.cal(2,4,5));


    }
}

class cals{
    void cal()
    {
        System.out.println("enter the numbers");
    }

    int cal(int a, int b){
        System.out.println("adding 2 number");
        return a + b;
    }

    int cal(int a, int b, int c){
        System.out.println("adding 3 number");
        return a + b + c;
    }


}
