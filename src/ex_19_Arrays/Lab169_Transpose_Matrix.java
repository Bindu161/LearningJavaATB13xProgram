package ex_19_Arrays;

public class Lab169_Transpose_Matrix {
    public static void main(String[] args) {
        int [] [] matrix = {
                {4,5,6},
        { 10,20,30},
        {15,13,24},
        };

        int [] [] transpose_matrix = new int[matrix[0].length][matrix[1].length];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose_matrix [j] [i] = matrix [i] [j];

                System.out.println();
            }
            
        }
        for (int i = 0; i < transpose_matrix.length ; i++) {
            for (int j = 0; j < transpose_matrix.length ; j++) {

                System.out.print(transpose_matrix[i][j]+ " | ");
            }
            System.out.println();
        }

    }
}
