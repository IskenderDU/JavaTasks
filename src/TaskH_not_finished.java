import java.util.Scanner;

public class TaskH_not_finished {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int c = n % 10;
        int b = (n / 10) % 10;
        int a = (n / 100) % 10;
        System.out.println(b);
    }
}
