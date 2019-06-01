package decorator.java;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author cx
 * @time 2019年6月1日 下午3:44:23
 */
public class Test {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\cx141\\design-pattern\\decorator\\src\\main\\java\\decorator\\java\\f.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            System.out.println("\n---");
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
