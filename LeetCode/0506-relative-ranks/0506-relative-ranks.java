import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        int[][] indexedScores = new int[score.length][2];
        
        for (int i = 0; i < score.length; i++) {
            indexedScores[i][0] = score[i];
            indexedScores[i][1] = i;
        }
        
        Arrays.sort(indexedScores, (a, b) -> b[0] - a[0]);

        for (int rank = 0; rank < score.length; rank++) {
            int originalIndex = indexedScores[rank][1]; 
            if (rank == 0) {
                answer[originalIndex] = "Gold Medal";
            } else if (rank == 1) {
                answer[originalIndex] = "Silver Medal";
            } else if (rank == 2) {
                answer[originalIndex] = "Bronze Medal";
            } else {
                answer[originalIndex] = String.valueOf(rank + 1);
            }
        }

        return answer;
    }
}