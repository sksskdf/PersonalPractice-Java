package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class bj10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str;
        while((str=br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append((a+b) + "\n");
        }
        bw.write(sb + "\n");
        bw.flush();
    }
}
