package Ex_021_OOPS_encapsulation;

public class Lab_69_encapsule {
    public static void main(String[] args) {
        father f1 = new father("Ankaj", 3500);
        //System.out.println(f1.getMoney());
        //System.out.println(f1.getName());
        f1.setMoney(3500,false);
        int f2 = f1.getMoney();
        System.out.println(f2);

    }
}

class father {

    private String name;
    private int money;


    public father(String name, int money) {
        this.name = name;
        this.money = money;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money, boolean b1) {
        if (b1) {
            this.money = money;
        } else {
            System.out.println("check the value");
        }
    }
}
