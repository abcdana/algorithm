package com.test.algo.programmers.level1;

public class GCD_LCM {

    public static int[] solution(int n, int m) {
        //int[] answer = {};
        int min = (n >= m) ? m : n;
        int gcd = 0, lcm = 1;


        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0){
                gcd = i;
            }
        }

        lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }

    public static void main(String[] args) {

        int n = 3, m = 12;

        System.out.println(solution(n, m));

    }
}
