package Ex_016_Arrays;

import java.util.Arrays;

public class Lab_55_array {
    public static void main(String[] args) {

        int []marks = {23, 45, 56, 75, 67};

        Arrays.sort(marks);

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);

        }

    }
}
