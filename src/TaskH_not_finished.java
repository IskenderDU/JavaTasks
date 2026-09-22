import java.util.Scanner;

public class TaskH_not_finished {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int b = (n % 100);
        int a = (n / 10)-(n /100);
        System.out.println(a);
    }
}