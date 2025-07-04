package Ex_019_OOPS_constructor;

public class Lab_65_CON {
    public static void main(String[] args) {
        student s2 = new student();
        System.out.println();

        student S1 = new student("Ankajk",224,"male");
        System.out.println(S1.name);
    }

}


class student {

    String name;
    int roll_no;
    String gender;


    student(){
        name= "Ankaj";
        roll_no= 978;
        gender="male";

    }

    student(String name_user, int roll_no_user, String gender_user){
        this.name = name_user;
        this.roll_no = roll_no_user;
        this.gender = gender_user;

    }

}
