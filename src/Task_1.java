import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args){
        int al=1, al2=0, al3;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
            for (int i = 0; i <= N-2; ++i) {
                al3 = al;
                al += al2;
                al2 = al3;
            }
        System.out.println(al);
    }
}
//