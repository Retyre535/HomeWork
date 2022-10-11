import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 1;
        int[][] a = new int[n][n];
        int x=0, y=0;
        a[x][y]=c;
        for (int j = n; j>1; j--) a[x][++y] = ++c;
        for (int i=n-1;i>=0;i--) {
            if (i % 2 == 1) {
                for (int j = i; j > 0; j--) a[--x][y] = ++c;
                for (int j = i; j > 0; j--) a[x][++y] = ++c;
            } else {
                for (int j = i; j > 0; j--) a[++x][y] = ++c;
                for (int j = i; j > 0; j--) a[x][--y] = ++c;
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] < 10) System.out.print(" " + a[i][j] + "\t");
                else System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}