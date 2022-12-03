import java.util.Scanner;

public class GetInputAsInteger {
    public static Integer[] inputAsArray() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return string2Integer(str);
    }

    private static Integer[] string2Integer(String intData) {
        String[] ss = intData.split(" ");
        int len = ss.length;
        Integer[] ints = new Integer[len];
        for (int i = 0; i < len; i++) ints[i] = Integer.valueOf(ss[i]);
        return ints;
    }
}
