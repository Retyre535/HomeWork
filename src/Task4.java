import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in).useLocale(Locale.ENGLISH);
        float n=in.nextFloat();
        if ((n<-2)||((n>3)&(n<6))||(n>9))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
