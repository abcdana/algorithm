package com.test.inflearnLecture.arry;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int answer = Integer.MIN_VALUE;

        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 =  0;
        for(int i=0; i<n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][(n-1)-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);

    }
}
