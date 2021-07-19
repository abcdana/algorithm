package com.test.algo.programmers.level1;

public class NNumbersSpacedByX {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;

        for (int i = 0; i < n; i++){
            answer[i] = num * (i+1);
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println(solution(2, 5));
    }
}
