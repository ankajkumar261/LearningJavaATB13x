package iNTERVIEW_PREP;

public class palindrome {
    public static void main(String[] args) {

        String str = "Ankaj";
        String rev ="";

        for (int i = str.length() -1; i >=0 ; i--) {
            rev += str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("its a palindrome");
        }
        else
        {
            System.out.println("its not palindrome");
        }




    }
}
