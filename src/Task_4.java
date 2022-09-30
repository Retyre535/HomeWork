import java.util.Scanner;

public class Task_4 {
    public static void main (String[] args){
        int a=9,a1;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i<=9; ++i){
            a1=N%10;
            if ((a1<a)&(a1!=0))
                a=a1;
            N/=10;
        }
        System.out.println(a);
    }
}
