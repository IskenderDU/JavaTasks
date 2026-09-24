import java.util.Scanner;

public class TaskQ_with_if_else {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double m = in.nextInt();
        double d = (m / n);
        if (d % 1 != 0) {
            System.out.println((int)++d);
        }
        else {
            System.out.println((int)d);
        }
    }
}
// Done by myself