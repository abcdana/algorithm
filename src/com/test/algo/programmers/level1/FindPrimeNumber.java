package com.test.algo.programmers.level1;

import java.util.ArrayList;

public class FindPrimeNumber {

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> primeNum = new ArrayList();

        for (int i = 0; i <= n; i++) {
            primeNum.add(i);
        }

        for (int i = 2; i <= n; i++){
            if (primeNum.get(i) == 0) continue;
            for (int j = 2*i; j <= n; j+=i) primeNum.set(j, 0);
        }

        for (int i = 2; i <= n; i++) {
            if (primeNum.get(i) != 0 && primeNum.get(i) != 1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 10;
        System.out.println(solution(n));

    }
}
