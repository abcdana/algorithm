package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        int num = 1000;

        char[] carr = str.toCharArray();
        int[] answer = new int[str.length()];

        for(int i=0; i<answer.length; i++){
            num = (carr[i] == t) ? 0 : num+1;
            answer[i] = num;
        }

        for(int i=answer.length-1; i>=0; i--){
            num = (carr[i] == t) ? 0 : num+1;
            answer[i] = (num < answer[i]) ? num : answer[i];
        }

        for(int i : answer){
            System.out.print(i + " ");
        }
    }
}
