package com.test.inflearnLecture.arry;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;

        //정수배열 만들기
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j] = 1;
            }
        }
        System.out.println(answer);

    }
}
