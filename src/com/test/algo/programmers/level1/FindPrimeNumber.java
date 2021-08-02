package com.test.algo.programmers.level1;

import java.util.ArrayList;

public class FindPrimeNumber {

    public static int solution(int n) {
        int answer = 0;

        boolean[] primeNum = new boolean[n+1];
        primeNum[1] = true;

        for(int i = 2; i <= n; i++) {
            for(int j = 2; i*j <= n; j++) {
                primeNum[i*j] = true;
            }
        }

        for (int i = 2; i <= n; i++){
            if (primeNum[i] == true) answer++;
        }

        System.out.println(answer);

        return answer - 1;
    }

    public static void main(String[] args) {

        int n = 10;
        System.out.println(solution(n));

    }
}
