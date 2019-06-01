package decorator.java;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author cx
 * @time 2019年6月1日 下午3:28:51
 */
public class LowerCaseInputStream extends FilterInputStream {

    /**
     * @param arg0
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        // System.out.println(result);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return super.read(b, off, len);
    }

}
