public class CharProcessOperation {
    public static StringBuffer charConvertProcess(StringBuffer stringBuffer) {
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == ' ') {
                //空格，继续下一轮
                continue;
            } else if (stringBuffer.charAt(i) < 'a' || stringBuffer.charAt(i) > 'z') {
                if (stringBuffer.charAt(i) < 'A' || stringBuffer.charAt(i) > 'Z') {
                    //别的字符要删去
                    stringBuffer.setCharAt(i, ' ');
                } else {
                    //大写字母转小写
                    stringBuffer.setCharAt(i, (char) (stringBuffer.charAt(i) + 32));
                }
            }
        }
        return stringBuffer;
    }
}
