package com.test.inflearnLecture.arry;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int student = 0;

        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<6; k++){
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                student = i;
                max = cnt;
            }

        }

        System.out.println(student);

    }
}
