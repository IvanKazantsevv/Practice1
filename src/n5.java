import java.util.Scanner;
public class n5 {
    public static void main(String[] args) {
        // 1.7
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        System.out.println(Fac(n));
    }
    public static int Fac(int n) // Метод, вычисляющий факториал числа
    {
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

}
