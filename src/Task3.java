import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h,m,s;
        if (n>=86400)
            n=n-n/86400*86400;
        String t;
        h=n/3600;
        m=(n-h*3600)/60;
        s=n-h*3600-m*60;
        t=h+":";
        if (m<10)
            t=t+"0"+m+":";
        else
            t=t+m+":";
        if (s<10)
            t=t+"0"+s;
        else
            t=t+s;
        System.out.println(t);
    }
}
