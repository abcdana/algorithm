import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int alarm_offset = 45;
        int minutes_in_hour = 60;

        M = M - alarm_offset;
        if (M < 0) {
            M = M + minutes_in_hour;
            H = (H - 1 + 24) % 24;
        }

        System.out.println(H + " " + M);
        br.close();
    }
}