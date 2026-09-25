import java.util.Scanner;

public class TaskL {
    private static Object String;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Totalhr = (n / 3600) % 24;
        int Totalmin = (n / 60) % 60;
        int Ttlsec = (n % 60);

        char zero = '0';

        String Ttlmin = "" + Totalmin;
        String Ttlsc = "" + Ttlsec;
        if (Totalmin < 10) {
            Ttlmin = "" + zero + Totalmin;
        }

        if (Ttlsec < 10) {
            Ttlsc = "" + zero + Ttlsec;
        }

        System.out.println(Totalhr + ":" + Ttlmin + ":" + Ttlsc);
    }
}