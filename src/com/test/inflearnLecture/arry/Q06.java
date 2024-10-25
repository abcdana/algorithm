package com.test.inflearnLecture.arry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06 {

    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            sb = new StringBuilder();
            int tmp = Integer.parseInt(sb.append(arr[i]).reverse().toString());
            if(isPrime(tmp)) answer.add(tmp);
        }

        for(int num : answer){
            System.out.print(num + " ");
        }
    }
}
