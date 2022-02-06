package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));

        // -543
        String bulgi = bw.readLine();
        int parsebulgi = Integer.parseInt(bulgi);
        String seogi = Integer.toString(parsebulgi-543);

        StringTokenizer st = new StringTokenizer(seogi);
        br.write(st.nextToken());
        br.flush();
        br.close();
    }
}
