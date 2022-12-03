import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {
    public static StringBuffer read(String pathname) {
        File in = new File(pathname); //指定输入文件
        InputStreamReader isr;
        try {
            isr = new InputStreamReader(new FileInputStream(in));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //自动错误处理
        }
        BufferedReader br = new BufferedReader(isr);//使用缓冲区，缓存输入的文档，可以使用缓冲区的read(),readLine()方法；

        StringBuffer stringBuffer = new StringBuffer();
        String str;
        while (true) {
            try {
                if ((str = br.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stringBuffer.append(str); //从文件中读取行到stringBuffer
        }
        return stringBuffer;
    }

    public static void write(String pathname, String strings) {
        FileWriter out;
        try {
            out = new FileWriter(pathname);
            out.write(strings);
            out.flush();
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
