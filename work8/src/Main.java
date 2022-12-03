import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] ss = str.split(" ");
        double amt = Double.parseDouble(ss[0]);
        double price = Double.parseDouble(ss[1]);
        System.out.print("Fee=");
        System.out.println(amt*price);
    }
}