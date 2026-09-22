import java.util.Scanner;

public class TaskA{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        double d = Math.sqrt(a * a + b * b);
        System.out.println(d);
    }
    }