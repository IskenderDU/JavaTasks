import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        System.out.println(((a * n) + ((b * n) / 100) % 1000000) + " " + ((b * n) % 100));

    }
}