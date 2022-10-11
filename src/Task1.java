import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int x=0,y=0;
        int[][] a = new int[n][m];
        while(true) {
            if (x<n) {
                if (y < m) {
                    a[x][y] = x*y;
                    y++;
                }
                else {
                    y = 0;
                    x++;
                }
            }
            else break;
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
}
