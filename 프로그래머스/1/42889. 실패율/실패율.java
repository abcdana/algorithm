import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] playerList = new int[N + 2];

        for (int stage : stages) {
            playerList[stage]++;
        }

        List<int[]> failList = new ArrayList<>();
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) { 
                failList.add(new int[]{i, 0, 1}); 
            } else {
                failList.add(new int[]{i, playerList[i], totalPlayers});
                totalPlayers -= playerList[i];
            }
        }

        failList.sort((a, b) -> {
            long failA = (long) a[1] * b[2];
            long failB = (long) b[1] * a[2];
            if (failB == failA) {
                return Integer.compare(a[0], b[0]);
            }
            return Long.compare(failB, failA);
        });

        for (int i = 0; i < N; i++) {
            answer[i] = failList.get(i)[0];
        }

        return answer;
    }
}