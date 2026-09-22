import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = n % 10;
        int b = (n / 10) % 10;
        int c = (n / 100) % 10;
        int d = (n / 1000) % 10;
        int first = (a + b);
        int second = (c + d);
        if (first == second)
            System.out.println(a + "+" + b + "=" + c + "+" + d);
        else {
            System.out.println(a + "+" + b + " not equal to " + c + "+" + d);
        }
    }
}