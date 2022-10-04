import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=1000000000,i;
        i = in.nextInt();
        int[] n = new int[i];
        for (int k=0;k<i;++k)
            n[k]= in.nextInt();
        for (int j=0;j<i;++j){
            if ((a>n[j])&(n[j]>0))
                a=n[j];
        }
        System.out.println(a);
    }
}
