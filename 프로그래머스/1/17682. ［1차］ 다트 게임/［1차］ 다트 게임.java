import java.math.*;

class Solution {
    public int solution(String dartResult) {
        String[] sarr = dartResult.split("(?<=\\D)(?=\\d)");
        int totalScore = 0; 
        int prevScore = 0;  

        for (int i = 0; i < sarr.length; i++) {
            int score;
            String bonus;
            String option = "";

            if (sarr[i].startsWith("10")) {
                score = 10;
                bonus = sarr[i].length() > 2 ? sarr[i].substring(2, 3) : "";
                if (sarr[i].length() > 3) {
                    option = sarr[i].substring(3, 4);
                }
            } else {
                score = Integer.parseInt(sarr[i].substring(0, 1));
                bonus = sarr[i].length() > 1 ? sarr[i].substring(1, 2) : "";
                if (sarr[i].length() > 2) {
                    option = sarr[i].substring(2, 3);
                }
            }

            if ("S".equals(bonus)) {
                score = (int) Math.pow(score, 1);
            } else if ("D".equals(bonus)) {
                score = (int) Math.pow(score, 2);
            } else if ("T".equals(bonus)) {
                score = (int) Math.pow(score, 3);
            }

            if (!option.isEmpty()) {
                if ("*".equals(option)) {
                    score *= 2;
                    if (i > 0) { // 첫 번째 라운드가 아니면 이전 점수에도 영향
                        totalScore += prevScore;
                    }
                } else if ("#".equals(option)) {
                    score *= -1;
                }
            }

            totalScore += score;
            prevScore = score;
        }

        return totalScore;
    }
}