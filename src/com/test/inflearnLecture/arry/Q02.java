package com.test.inflearnLecture.arry;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.nextLine();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int answer = 1;
        int max = arr[0];

        for(int i=1; i<N; i++){
            if(arr[i] > max){
                max = arr[i];
                answer++;
            }
        }

        System.out.println(answer);

    }
}
