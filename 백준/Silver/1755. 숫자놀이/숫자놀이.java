import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());

        String[] numberlist = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        List<String> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            String word = convert(i, numberlist);
            list.add(word + i);
        }

        Collections.sort(list);

        int count = 0;
        for (String s : list) {
            if (count % 10 == 0 && count != 0){
                bw.write("\n");
            }
            bw.write(s.replaceAll("[a-z]","").trim() + " ");
            count++;
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static String convert(int i, String[] numberlist) {
        StringBuilder sb = new StringBuilder();
        for(char d : String.valueOf(i).toCharArray()){
            sb.append(numberlist[d - '0']).append(" "); //0빼줘서 ASCII 코드 전환
        }
        return sb.toString();
    }
}
