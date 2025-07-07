package Ex_021_OOPS_encapsulation;

public class realword {
    public static void main(String[] args) {
        login l1 = new login("chrome", 2233);
        String logs = l1.getName();
        System.out.println(logs);
        int passi = l1.getPassword();
        System.out.println(passi);
        l1.setPassword(4445, true);
        int setpass= l1.getPassword();
        System.out.println(setpass);





    }
}


class login {
    private String name;
    private int password;

    public login(String name, int password) {

        this.name = name;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password, boolean b1) {
        if (b1) {
            this.password = password;
        } else {
            System.out.println("u cant change");
        }
    }
}
