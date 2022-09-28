import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args){
        int rabbits=11, wolfs=2, eaten=0, i;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (i = 1; i <= N; ++i) {
            if (rabbits/wolfs<10)//-волк
                wolfs-=wolfs*10/rabbits;
            if (i % 2 != 0){//зайцы*3
                rabbits *= 3;
                if (rabbits>19000000)
                    rabbits=19000000;
            }
            if (i % 2 == 0) {//-10зайцев
                rabbits -= 10*wolfs;
                eaten+=10*wolfs;
            }
            if (eaten>=70){//+волк
                wolfs+=eaten/70;
                eaten=eaten-eaten/70*70;
            }
        }
        System.out.println(rabbits+" "+wolfs);
    }
}
