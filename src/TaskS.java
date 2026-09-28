import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int ost = h - a;
        int dailyStep = a - b;
        int d = ost / dailyStep;
        d = d + 1;

        if (ost % dailyStep != 0) {
            d = d + 1;
        }
        System.out.println(d);
    }
}