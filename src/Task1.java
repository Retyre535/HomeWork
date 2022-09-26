import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b;
        a=n%10+n/10%10+n/100%10;
        b=n+2-n%2;
        System.out.println(a+" "+b);
    }
}