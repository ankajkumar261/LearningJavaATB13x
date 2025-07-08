package Ex_022_OOPS_Accessmodifiers;

public class police {

}



class Cop {
    public int gun;
    private String iCard;


    public Cop(int bullet){
        this.gun = bullet;
    }

    // Method and / Behav
     void canIShoot(){
        System.out.println("Yes you can !!");
    }

    protected void thisDefaultF1(){
       System.out.println("Hi, Cop!");
   }
}