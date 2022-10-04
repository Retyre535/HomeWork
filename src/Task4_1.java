import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        --i;
        int l1,l2;
        l2=in.nextInt();
        for (int j=0;j<i;j++){
            l1=in.nextInt();
            if (l1>l2)
                System.out.println(l1);
            l2=l1;
        }
    }
}
