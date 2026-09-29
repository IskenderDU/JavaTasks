import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int b1 = a / 1000;
        int b2 = (a / 100) % 10;
        int b3 = (a / 10) % 10;
        int b4 = a % 10;
        boolean symmetric = (b1 == b4) && (b2 == b3);
        System.out.println(symmetric);
    }
}