import java.util.Map;
import java.util.TreeMap;

public class GenerateStatistic {
    public static Map<String, Integer> arrayToMap(String[] strings){
        Map<String, Integer> map = new TreeMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        return map;
    }

    public static String mapToString(Map<String, Integer> map){
        StringBuffer stringBuffer = new StringBuffer();
        for (String key: map.keySet()){
            stringBuffer.append(key);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
