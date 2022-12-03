import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Integer[] String2Integer(String intData) {
        String[] ss = intData.split(" ");
        int len = ss.length;
        Integer[] ints = new Integer[len - 1];
        for (int i = 0; i < len - 1; i++) {
            ints[i] = Integer.valueOf(ss[i]);
        }
        Arrays.sort(ints);
        return ints;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Line 1
        String str1 = sc.nextLine(); //读取第1行
        Integer[] arr1 = String2Integer(str1); //转为Integer[]
        //Line 2
        String str2 = sc.nextLine(); //读取第2行
        Integer[] arr2 = String2Integer(str2); //转为Integer[]
        ArrayList<Integer> ar2 = new ArrayList<>(Arrays.asList(arr2));
        ArrayList<Integer> ar12 = new ArrayList<>(Arrays.asList(arr1));
        ar12.retainAll(ar2);  //ar12获得ar1 和 ar2的交集
        if (ar12.size() > 0) {
            for (int i = 0; i < ar12.size() - 1; i++) {
                System.out.print(ar12.get(i) + " ");
            }
            System.out.println(ar12.get(ar12.size() - 1));
        }
    }
}