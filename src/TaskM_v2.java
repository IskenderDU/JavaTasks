import java.util.Scanner;

public class TaskM_v2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println( a + " " + b);

    }
}
