package Ex_017_Arrays_2;

public class Lab_62_transpose {
    public static void main(String[] args) {

        int [][] marks = {

                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int rows = marks.length;
        int col = marks[0].length;

       // transposing the matrix
        int [][] transpose = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]= marks[i][j];
            }
        }

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(transpose[i][j] + " | ");

            }
            System.out.println();

        }



    }
}
