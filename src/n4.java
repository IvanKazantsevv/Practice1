public class n4 {
    public static void main(String[] args) {
        // 1.6
        double sum = 0;
        for (double i = 1; i < 11; i++) {
            double d = 1/i;
            System.out.printf("%.2f\n", d);
            sum += d;
        }
        System.out.printf("%.2f\n", sum);
    }
}
