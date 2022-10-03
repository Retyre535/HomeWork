import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        if (n < 0) {
            n = Math.abs(n);
            b = -1;
        }

        while(n > 0) {
            a += n % 10;
            a *= 10;
            n /= 10;
        }

        System.out.println(a / 10 * b);
    }
}
