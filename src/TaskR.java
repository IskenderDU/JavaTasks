import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); //7
        int k = in.nextInt(); //30

        //n - (k % n)

        System.out.println((n - (k % n)) % n);
    }
}