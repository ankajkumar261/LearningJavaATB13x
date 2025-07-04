package Ex_019_OOPS_constructor;

public class Lab_64_person {
    public static void main(String[] args) {

        person p1 = new person();
        System.out.println(p1.name);
        System.out.println(p1.address);
        System.out.println(p1.phone);


    }

}
class person {

    String name;
    long phone;
    String address;


    person(){
        name="Ankaj";
        phone= 8628813869l;
        address="vill hara , teh fatehpur , distt:- kangra ";
    }

}