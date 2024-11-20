import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        int dasom = Integer.parseInt(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int count = 0;

        while (!pq.isEmpty() && pq.peek() >= dasom) {
            int max = pq.poll();
            max--;
            dasom++;
            pq.offer(max);
            count++;
        }

        System.out.println(count);
    }
}