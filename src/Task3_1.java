import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=1000000000,n,i;
        i = in.nextInt();
        for(;i>0;--i){
            n = in.nextInt();
            if ((n>0)&(n<a))
                a = n;
        }
        System.out.println(a);
    }
}