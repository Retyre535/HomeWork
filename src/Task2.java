import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        b+=a*100;
        b*=n;
        System.out.println(b/100+" "+b%100);

    }
}