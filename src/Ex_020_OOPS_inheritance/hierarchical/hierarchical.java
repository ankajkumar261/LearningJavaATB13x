package Ex_020_OOPS_inheritance.hierarchical;

public class hierarchical {
    public static void main(String[] args) {

        father f1 = new father();
        amit a1= new amit();
        sumit s1 = new sumit();

        a1.home();
        s1.home();





    }
}

class father {

    void home (){
        System.out.println("father,s home");
    }
}

class amit extends father {
     void a1 (){
         System.out.println("amit");
     }
}
class sumit extends father {
    void s1() {
        System.out.println("sumit");
    }
}
class ankaj extends father {
    void an1() {
        System.out.println("Ankaj");
    }
}
