package com.test.algo.programmers.level1;

public class FindPrimeNumber {

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i < n; i++){
            if(n % i == 0) answer = i;
        }
        return answer;
    }

    public static void main(String[] args) {

        int b = 10;
        int n = 10;
        System.out.println(solution(n));

    }
}
