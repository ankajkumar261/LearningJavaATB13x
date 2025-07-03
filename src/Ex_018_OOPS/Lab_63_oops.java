package Ex_018_OOPS;

public class Lab_63_oops {
    public static void main(String[] args) {

     baby b1 = new baby();
     baby b2 = new baby();
        System.out.println(b2.name);
        System.out.println(b1.name);
        System.out.println(b1.aadhar_number);
        System.out.println(b1.year);


    }
}

class baby {
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    baby () {
        name= "ankaj";
        aadhar_number= "8687264872";
        year = 2024;
        month = 12;
        day = 07;


    }
}
