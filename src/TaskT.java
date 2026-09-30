import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        int diff1 = a - d;
        int diff2 = b - c;

        int result = 1 - (diff1 * diff1 + diff2 * diff2);

        System.out.println(result);
    }
}