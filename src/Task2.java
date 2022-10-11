import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = 2*n+1;
        int c = d*d-1;
        int[][] a = new int[d][d];
        int x=0, y=d-1;
        for (int i=0;i<4*n;i++) {
            while (x+2*i < d) {
                a[x][y] = c--;
                ++x;
            }
            while (y-2*i > 0) {
                a[x][y-1] = c--;
                --y;
            }
            while (x-2*i > 0) {
                a[x][y] = c--;
                --x;
            }
            while (y+2*i < d) {
                a[x][y] = c--;
                ++y;
            }
            System.out.println("1");
        }
    }
}