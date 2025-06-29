package ex_19_Arrays;

public class Lab160_SUM_OF_ARRAYS {
    public static void main(String[] args) {
        int [] numbers = {14, 35, 47};
        int sum =0;

        for (int i = 0; i < numbers.length ; i++) {
            sum =sum+numbers[i];
        }
        System.out.println(sum);
    }
}
