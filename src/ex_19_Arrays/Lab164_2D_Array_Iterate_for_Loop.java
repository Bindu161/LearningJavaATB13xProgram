package ex_19_Arrays;

public class Lab164_2D_Array_Iterate_for_Loop {
    public static void main(String[] args) {
        int [] [] matrix = {{ 1,2,3}, {7,8,9}, {14,27}};
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.println(matrix[i][j] + "| ");
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
