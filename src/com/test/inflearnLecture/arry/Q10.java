package com.test.inflearnLecture.arry;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        // 배열 입력 : 입력 안한 배열은 0으로 자동 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int center = arr[i][j];
                if(center > arr[i-1][j]
                        && center > arr[i+1][j]
                        && center > arr[i][j+1]
                        && center > arr[i][j-1]){
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }
}
