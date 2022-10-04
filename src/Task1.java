import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int b=0;
        int a = in.nextInt();
        int n = in.nextInt();
        while (a>0){
            if(a%10!=n) {
                b += a % 10;
                b *= 10;
            }
            a/=10;
        }
        while (b>0){
            a+=b%10;
                a*=10;
            b/=10;
        }
        System.out.println(a/10);
    }
}