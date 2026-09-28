import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();

        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();

        int TotalSec1 = ((h * 3600) + (m * 60) + s);
        int TotalSec2 = ((h2 * 3600) + (m2 * 60) + s2);

        if (TotalSec1 > TotalSec2) {
            System.out.println(TotalSec1 - TotalSec2);
        }
        if (TotalSec1 < TotalSec2) {
            System.out.println(TotalSec2 - TotalSec1);
        }
    }
}
