package Ex_023_OOPS_Abstract;

public class Lab_70_abstarct {
    public static void main(String[] args) {

        son s1 = new son();
        s1.homeloan1();
        s1.homeloan();


    }

}


abstract class father {

    abstract void homeloan();

    void homeloan1(){
        System.out.println("25k loan");

    }

}

class son extends  father{


    @Override
    void homeloan() {
        System.out.println("50k loan ");
    }
}
