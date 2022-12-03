import java.util.Arrays;

public class StringOperations {
    public static String[] stringBufferToArrayList(StringBuffer stringBuffer) {
        String string = stringBuffer.toString();
        String[] stringArray = string.split("\\s+");
        Arrays.sort(stringArray);
        return stringArray;
    }
}
