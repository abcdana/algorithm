package com.test.algo.baekjoon.bronze;

import java.util.Scanner;

public class B11561 {

/*    //밟을 수 있는 징검다리의 최대 수.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] N = new int[T];

        for (int i = 0; i < T; i++) {
            N[i] = sc.nextInt();
        }

        for (int n : N) {
            System.out.println("n : " + n + "max : " + maxSteps(n));
        }

    }

    public static int maxSteps(int a) {
        int jumpDis = 1; //제자리 뛰기 한 거리
        int steps = 0;  //제자리 뛰기 수
        int loc = 0;    //현재 위치

        while (loc + jumpDis <= a) {
            loc += jumpDis;
            jumpDis++;
            steps++;
        }

        return steps;
    }*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        long[] N = new long[T];
        for (int i = 0; i < T; i++) {
            N[i] = sc.nextLong();
        }

        for (long n : N) {
            System.out.println(maxSteps(n));
        }
    }

    public static long maxSteps(long n) {
        long left = 1, right = (long) Math.sqrt(2 * n); // 최대 범위 추정
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = (mid * (mid + 1)) / 2; // 등차수열 합 공식 사용

            if (sum <= n) {
                result = mid; // 최대 가능한 k 저장
                left = mid + 1; // 더 큰 범위 탐색
            } else {
                right = mid - 1; // 더 작은 범위 탐색
            }
        }

        return result;
    }
}
