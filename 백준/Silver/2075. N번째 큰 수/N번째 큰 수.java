import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                pq.offer(Integer.parseInt(stk.nextToken()));
            }
        }

        for(int i = 0; i < N - 1; i++){
            pq.poll();
        }

        System.out.println(pq.peek());
        br.close();
    }
}
