import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt(),l=1000000000;
        int[] n = new int[i];
        for (int j=0;j<i;++j)
            n[j] = in.nextInt();
        for (int y=0;y<i;++y){
            if (n[y]>l)
                System.out.println(n[y]);
            l = n[y];
        }
    }
}
