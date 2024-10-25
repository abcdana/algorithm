package com.test.inflearnLecture.arry;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        String answer = "";

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=0; i<n-2; i++){
            arr[i+2] = arr[i] + arr[i+1];
        }

        for (int num : arr) {
            sb.append(num).append(" ");
        }

        System.out.println(sb.toString());

    }
}
