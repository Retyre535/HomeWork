import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int a1=1,b1=1,c1=1;
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        if (a/1000<1 & a%1000>=100 & a%5==0)
            a1=0;
        if (b/1000<1 & b%1000>=100 & b%5==0)
            b1=0;
        if (c/1000<1 & c%1000>=100 & c%5==0)
            c1=0;
        if ((a1==0 & (b1==0 || c1==0)) || (b1==0 & c1==0))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
