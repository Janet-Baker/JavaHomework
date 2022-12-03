import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        short q10 = 0, q5 = 0, q2 = 0, q1 = 0;
        while (a >= 10) {
            a -= 10;
            q10++;
        }
        while (a >= 5) {
            a -= 5;
            q5++;
        }
        while (a >= 2) {
            a -= 2;
            q2++;
        }
        while (a > 0) {
            a -= 1;
            q1++;
        }
        System.out.println(q10+" "+q5+" "+q2+" "+q1);
    }
}