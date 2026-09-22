import java.util.Scanner;

class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = 109;
        int v = in.nextInt();
        int t = in.nextInt();
        int D = v * t;
        if (D > 0) {
            System.out.println(D%S);
        }
        else if (D < 0) {
            System.out.println(D % S + 109);
        }


    }
}