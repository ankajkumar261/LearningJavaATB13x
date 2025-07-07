package Ex_020_OOPS_polymorphism_methodoverloading.methodoverloading;

public class Lab_67_overloading {
    public static void main(String[] args) {
        father f1 = new father();
        f1.home();
        f1.home(2);

    }
}

class father {

    void home (){
        System.out.println("2bhk");
    }

    int home(int a ){
        System.out.println("my home, my life is fucked" + a);
        return a;
    }
}

