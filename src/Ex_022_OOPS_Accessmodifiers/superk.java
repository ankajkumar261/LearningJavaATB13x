package Ex_022_OOPS_Accessmodifiers;

public class superk {
    public static void main(String[] args) {

        car c = new car();
        c.sound();
    }

}


class vehicle{

    void sound(){
        System.out.println("all are having same sound");
    }

}

class car extends vehicle{

    @Override
    void sound() {
        super.sound();
    }
}