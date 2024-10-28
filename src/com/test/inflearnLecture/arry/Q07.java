package com.test.inflearnLecture.arry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] point = new int[n];
        int p = 1;
        for(int i=0; i<n; i++){
            if(arr[i] == 1) {
                point[i] = p;
                p++;
            } else p = 1;
        }

        int answer = 0;
        for(int num : point){
            answer += num;
        }
        System.out.println(answer);
    }
}
