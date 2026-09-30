import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //8
        int m = in.nextInt(); //2

        int a = (n % m) * (m % n);

        System.out.println(a + 1);
    }
}