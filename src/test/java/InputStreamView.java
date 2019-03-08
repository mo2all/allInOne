import java.io.IOException;
import java.io.InputStream;

/**
 * @Description
 * @Author Skye
 * @Date 2019/2/26 10:59
 * @Version 1.0
 **/
public class InputStreamView {
    InputStream is = new InputStream() {
        @Override
        public int read() throws IOException {
            return 0;
        }
    };

    public static void main(String[] args) {
        InputStreamView c = new InputStreamView();
        try {

            System.out.println(c.is.read());
        }catch (IOException e) {
            e.printStackTrace();
        }
        int[] arr = new int[8];
        int n =0;
        int[] res = new int[5];
        for (int i : arr) {
            System.out.print(i==(n-1) ? (res[i]) : (res[i]+" "));
        }
    }
}
