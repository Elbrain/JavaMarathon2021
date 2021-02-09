package day18;

public class Task1 {
    public static void main(String[] args) {
        int total = 0;
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
         total = recursionSum(numbers, numbers.length, total);
        System.out.println(total);
    }

    public static int recursionSum(int[] numbers, int i, int total) {
        i--;
        if (i < 0) return total;
        total += numbers[i];
        return recursionSum(numbers, i, total);
    }
}
