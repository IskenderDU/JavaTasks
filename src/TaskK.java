import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int TotalMinutes = in.nextInt();
        int Hours = (TotalMinutes / 60) % 24;
        int Minutes = TotalMinutes % 60;
        System.out.println(Hours + " " + Minutes);
    }
}