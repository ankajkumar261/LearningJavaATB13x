package Practice_Java;

public class task_2 {
    public static void main(String[] args) {


        float temp = 98.4f;
        if (temp > 98.4) {
            System.out.println("SUMMER");
        } else {
            System.out.println("UNKNOWN");
        }

        int i=0;
        for(i=1; i<=6;i++)
        { if(i%3==0)
            continue;
        System.out.print(i+","); }

        int x = 30; if(x < 5) System.out.print("Small"); else if(x < 15) System.out.print("Medium"); else System.out.print("Large");


    }
}
