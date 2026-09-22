import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = (n % 10);
        int b = (n / 10) % 10;
        int a = (n / 100) % 10;

        int summa = (a + b + c);
        System.out.println(summa);
    }
}