package Ex_023_OOPS_Abstract;

public class cars {

    public static void main(String[] args) {

        car tesla = new car();
        tesla.drive();




    }
}

abstract class engine {

    abstract void startengine();

    abstract void stopengine();


    void checkengine(){
        System.out.println("everything is good");
    }

}

class car extends engine{

    @Override
    void startengine() {
        System.out.println("start the engine");
    }

    @Override
    void stopengine() {
        System.out.println("stop the engine");
    }

    void drive(){
        startengine();
        checkengine();
        stopengine();
    }

}