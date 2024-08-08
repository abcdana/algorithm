package com.test.columbus.string_math;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class B1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력을 받아 M과 N을 설정
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());

        // 에라토스테네스의 체 알고리즘을 사용하여 주어진 범위 내의 소수를 판별
        boolean[] isPrime = new boolean[N + 1]; // 소수 배열 선언 (N까지 포함)

        Arrays.fill(isPrime, true); // 모든 값을 true로 초기화
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아니므로 false

        // 2부터 시작하여 각 숫자의 배수를 false로 설정 (소수가 아님을 표시)
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) { // i가 소수인 경우
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // i의 배수들을 false로 설정 => i의 배수는 소수가 아님
                }
            }
        }

        // 소수 출력
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                bw.write(i + "\n"); // 소수를 한 줄에 하나씩 출력
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
