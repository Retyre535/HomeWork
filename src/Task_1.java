import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        NumberDigits f = new NumberDigits();
        System.out.println(f.sumOfSeven(a,b));
    }
}
class NumberDigits{
    public static int sumOfSeven(int a,int b){
        int d=0;
        while (a%7!=0)
            a++;
        for (int i=a; i<=b; i+=7)
            if ((i>-100)&(i<100))
                d+=i%10+i/10;
        return(d);
    }
}