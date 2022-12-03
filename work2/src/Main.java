import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sz = 0, zm = 0;
        Scanner sc = new Scanner(System.in);
        mainThread:
        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') { // 统计数字
                    sz++;
                    continue;
                }
                if ((ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z') { // 统计字母
                    zm++;
                }
                if (ch == 26) {
                    break mainThread;
                }
            }
        }
        sc.close();
        System.out.print(zm);
        System.out.print(" ");
        System.out.println(sz);
    }
}