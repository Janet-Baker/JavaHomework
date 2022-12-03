import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int getNumber = scanner.nextInt();
        int a = getNumber;
        int sum = 0;
        while((a/10) > 0){
            int b = a/10;
            sum += (a-(b*10));
            a = a/10;
        }
        sum += a;
        System.out.println(sum);
    }
}