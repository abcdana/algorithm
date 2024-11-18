import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Hcenti = Integer.parseInt(input[1]);
        int T = Integer.parseInt(input[2]);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int hammerUsed = 0;

        while (!pq.isEmpty() && hammerUsed < T) {
            int tallest = pq.poll();

            if (tallest < Hcenti) break;

            if (tallest == 1) {
                pq.add(tallest);
                break;
            }

            pq.add(tallest / 2);
            hammerUsed++;
        }

        int tallestAfter = pq.isEmpty() ? 0 : pq.peek();

        if (tallestAfter < Hcenti) {
            System.out.println("YES");
            System.out.println(hammerUsed);
        } else {
            System.out.println("NO");
            System.out.println(tallestAfter);
        }
    }
}