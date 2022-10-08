import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        MyArrays g = new MyArrays();
        System.out.println(g.avgOf4Digit(a)+"0");
    }
}
class MyArrays{
    public static double avgOf4Digit(int a){
        Scanner in = new Scanner(System.in);
        int d=0, f=0;
        int[] b = new int[a];
        for (int i=0;i<a;i++) b[i]=in.nextInt();
        for (int i=0;i<a;i++) {
            if ((b[i] >= 1000) & (b[i] < 10000)) {
                d += b[i];
                f += 1;
            }
        }
        if (f==0) return(-1.00);
        else return((double)d/f);
    }
}