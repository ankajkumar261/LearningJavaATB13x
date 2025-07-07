package Ex_020_OOPS_polymorphism_methodoverloading.overriding;

public class Lab_69_overriding {
    public static void main(String[] args) {

        father f1 = new son();
        System.out.println("check which home");
        f1.home();


    }

}

class father {
    void home(){
        System.out.println("2bhk");
    }
}

class son extends father{
    @Override
    void home(){
        System.out.println("3bhk");
    }
}
