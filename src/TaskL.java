import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Totalhr = (n / 3600) % 24;
        int Totalmin = (n / 60);
        int Ttlsec = (n % 60);
        System.out.println(Totalhr + ":" + Totalmin + ":" + Ttlsec);
    }
}