import java.util.Scanner;
public class n2 {
    public static void main(String[] args) {
        // 1.4
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        array[0] = in.nextInt();
        int min = array[0], max = 0, sum = 0;

        // цикл for
        for (int i = 1; i < n; i++) {
            array[i] = in.nextInt();
            sum += array[i];
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        // цикл while
        int i = 1;
        while (i < n) {
            array[i] = in.nextInt();
            sum += array[i];
            i++;
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        // цикл do while
        do {
            array[i] = in.nextInt();
            sum += array[i];
            i++;
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        } while (i < n);

        System.out.println("Сумма: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
