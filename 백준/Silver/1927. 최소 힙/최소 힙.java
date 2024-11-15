import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > 0) {
                minHeap.add(x); // 자연수라면 최소 힙에 추가
            } else {
                if (minHeap.isEmpty()) {
                    bw.write("0\n"); // 힙이 비어있다면 0 출력
                } else {
                    bw.write(minHeap.poll() + "\n"); // 최소값 출력하고 제거
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}