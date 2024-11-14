import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 명령의 개수
        Queue<Integer> queue = new LinkedList<>(); // 대기 줄을 저장하는 큐
        int maxQueueSize = 0;
        int minLastStudentAtMax = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("1")) { // 학생 줄서기 명령
                int studentNumber = Integer.parseInt(st.nextToken());
                queue.add(studentNumber);

                if (queue.size() > maxQueueSize) {
                    maxQueueSize = queue.size();
                    minLastStudentAtMax = studentNumber;
                } else if (queue.size() == maxQueueSize) {
                    minLastStudentAtMax = Math.min(minLastStudentAtMax, studentNumber);
                }
            } else if (command.equals("2")) { // 학생 식사 시작
                queue.poll();
            }
        }

        System.out.println(maxQueueSize + " " + minLastStudentAtMax);
    }
}
