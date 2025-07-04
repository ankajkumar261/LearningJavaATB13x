package Ex_020_OOPS_inheritance;

public class Lab_66_inheritance {
    public static void main(String[] args) {
        father f1 = new father();
        son amit = new son();
        father f2 = new son();
        //son rahul = new father();
        amit.home();
        f2.home();


    }

}

class father{
    void home(){
        System.out.println("i own one house");
    }

}

class son extends father{
    void name(){
        System.out.println("Ankaj");
    }
}
