import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) b[i] = in.nextInt();
        MyArrays1 f = new MyArrays1();
        b = f.minToBegin(a,b);
        for (int i =0;i<a;i++) System.out.print(b[i]+" ");
    }
}
class MyArrays1{
    public static int[] minToBegin(int a,int[] b){
        int m, c = 0, u, p;
        m = b[0];
        for (int i =0; i<a;i++) if (b[i]<m) m=b[i];
        for (int i =0; i<a;i++) if (b[i]==m){
            c=i;
            break;
        }
        b[c]=0;
        u=b[0];
        for (int i=0;i<c;i++){
            if (i<c){
                p = b[i + 1];
                b[i + 1] = u;
            }
            else {
                p=b[i];
                b[i]=u;
            }
            u = p;
        }
        b[0]=m;
        return(b);
    }
}