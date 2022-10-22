import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte[] a=new byte[16];
        for(int i=0;i<16;++i){
            boolean b = in.nextBoolean();
            if (b) a[i]=1;
            else a[i]=0;
        }
        for (int i=0;i<16;++i) {
            if (a[i]==1) System.out.println(true);
            else System.out.println(false);
        }
    }
}
