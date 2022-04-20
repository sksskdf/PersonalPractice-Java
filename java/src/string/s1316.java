package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class s1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] groupStrings = new String[n];

        for (int i = 0; i < groupStrings.length; i++) {
            groupStrings[i] = br.readLine();;
        }
        int count = n;
        boolean isEnd = false;
        //aaba
        for (int i = 0; i < groupStrings.length; i++) {
            ArrayList<Character> storedChar = new ArrayList<>();
            for (int j = 1; j < groupStrings[i].length(); j++) {
                //한글자만있는 경우
                if(groupStrings[i].length() == 1)
                    break;
                else if (groupStrings[i].charAt(j) != groupStrings[i].charAt(j-1)) {
                    //검사
                    storedChar.add(groupStrings[i].charAt(j-1));
                    for (int k = 0; k < storedChar.size(); k++) {
                        isEnd = false;
                        if (groupStrings[i].charAt(j) == storedChar.get(k)) {
                            count--;
                            isEnd = true;
                            break;
                        }
                    }
                    if(isEnd) {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
