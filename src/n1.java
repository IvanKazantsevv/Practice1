import java.util.Scanner;
public class n1 {
    public static void main(String[] args) {
        // 1.3
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            sum += array[i];
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + sum / n);
    }
}
