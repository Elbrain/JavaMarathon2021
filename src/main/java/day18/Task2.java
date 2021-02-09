package day18;

public class Task2 {
    static int sum = 0;
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int i) {
        if (i < 7) return sum;
        if (i % 10 == 7){
            sum++;
        }

        return count7(i /10) ;
    }
}
