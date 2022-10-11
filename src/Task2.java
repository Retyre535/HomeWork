import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = 2*n+1;
        int c = 0;
        int[][] a = new int[d][d];
        int x=n, y=n;
        a[x][y]=0;
        for (int i=1;i<d;i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < i; j++) {
                    c++;
                    x--;
                    a[x][y] = c;
                }
                for (int j = 0; j < i; j++) {
                    c++;
                    y--;
                    a[x][y] = c;
                }
            } else {
                for (int j = 0; j < i; j++) {
                    c++;
                    x++;
                    a[x][y] = c;
                }
                for (int j = 0; j < i; j++) {
                    c++;
                    y++;
                    a[x][y] = c;
                }
            }
        }
        for (int j = 0; j < d-1; j++) {
            c++;
            x--;
            a[x][y] = c;
        }
        for (int i=0;i<d;i++) {
            for (int j = 0; j < d; j++) {
                if (a[i][j] < 10) System.out.print(" " + a[i][j] + "\t");
                else System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}