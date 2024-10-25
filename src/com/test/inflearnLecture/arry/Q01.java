package com.test.inflearnLecture.arry;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        String input = sc.nextLine();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        //첫 번째 수는 무조건 출력
        sb.append(arr[0]);

        for(int i=1; i<N; i++){
            if(arr[i-1]<arr[i]) sb.append(" " + arr[i]);
        }

        System.out.println(sb.toString());

    }
}
