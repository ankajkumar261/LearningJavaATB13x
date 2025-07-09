package Ex_024_OOPS_interfaces;

public class Lab_72_Interfaces {

    public static void main(String[] args) {
        child c1 = new child();
        c1.money();
    }


}


interface father1{
    void money();
}

interface father2{
    void money();
}

class child implements father1, father2{
    @Override
    public void money() {
        System.out.println("childs money");
    }
}