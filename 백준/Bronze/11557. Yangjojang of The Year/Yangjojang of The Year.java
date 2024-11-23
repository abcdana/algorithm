import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine()); 
            String maxSchool = "";
            int maxLiquor = -1;

            for (int i = 0; i < N; i++) {
                StringTokenizer stk = new StringTokenizer(br.readLine());
                String school = stk.nextToken();
                int liquor = Integer.parseInt(stk.nextToken());

                if (liquor > maxLiquor) {
                    maxLiquor = liquor;
                    maxSchool = school;
                }
            }

            sb.append(maxSchool).append("\n");
        }

        System.out.print(sb.toString());
    }
}