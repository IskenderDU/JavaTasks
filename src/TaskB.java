import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("The next number for the number " + a + " is " + ++a + ".");
        int b = (a - 1);
        System.out.println("The past number for the number " + b + " is " + --b + ".");
    }
}