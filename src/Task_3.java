import java.util.Scanner;

public class Task_3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            switch (t % 100) {
                case (11):
                case (12):
                case (13):
                case (14):
                    System.out.println(t + " TORTOV");
                    break;
                default:
                    switch (t % 10) {
                        case (1):
                            System.out.println(t + " TORT");
                            break;
                        case (2):
                        case (3):
                        case (4):
                            System.out.println(t + " TORTA");
                            break;
                        case (5):
                        case (6):
                        case (7):
                        case (8):
                        case (9):
                        case (0):
                            System.out.println(t + " TORTOV");
                            break;

                    }
            }
    }
}
