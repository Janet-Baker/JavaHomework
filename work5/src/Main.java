import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //输入部分
        StringBuffer stringBuffer = FileOperations.read("in.txt");
        //处理部分
        CharProcessOperation.charConvertProcess(stringBuffer);//处理大写字母和其他符号
        String[] sortedStringArray = StringOperations.stringBufferToArrayList(stringBuffer);//转为列表
        Map<String, Integer> map = GenerateStatistic.arrayToMap(sortedStringArray);//Map去重/计数(写多了)
        String results = GenerateStatistic.mapToString(map);
        //输出部分
        FileOperations.write("words.txt",results);
    }
}