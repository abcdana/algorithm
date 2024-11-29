import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int testCase = 0; testCase < T; testCase++) {
            String S = br.readLine();
            int n = S.length();
            StringBuilder firstPlayerLetters = new StringBuilder();
            for (int t = 0; t < n; t++) {
                int pos = (t * 2) % n;
                firstPlayerLetters.append(S.charAt(pos));
            }
            String firstPattern = firstPlayerLetters.toString();
            int len = firstPattern.length();
            for (int p = 1; p <= len; p++) {
                if (len % p == 0) {
                    String pattern = firstPattern.substring(0, p);
                    StringBuilder repeated = new StringBuilder();
                    int times = len / p;
                    for (int i = 0; i < times; i++) {
                        repeated.append(pattern);
                    }
                    if (repeated.toString().equals(firstPattern)) {
                        firstPattern = pattern;
                        break;
                    }
                }
            }
            StringBuilder secondPlayerLetters = new StringBuilder();
            for (int t = 0; t < n; t++) {
                int pos = (t * 2 + 1) % n;
                secondPlayerLetters.append(S.charAt(pos));
            }
            String secondPattern = secondPlayerLetters.toString();
            len = secondPattern.length();
            for (int p = 1; p <= len; p++) {
                if (len % p == 0) {
                    String pattern = secondPattern.substring(0, p);
                    StringBuilder repeated = new StringBuilder();
                    int times = len / p;
                    for (int i = 0; i < times; i++) {
                        repeated.append(pattern);
                    }
                    if (repeated.toString().equals(secondPattern)) {
                        secondPattern = pattern;
                        break;
                    }
                }
            }
            result.append(firstPattern).append("\n").append(secondPattern).append("\n");
        }
        System.out.print(result);
    }
}