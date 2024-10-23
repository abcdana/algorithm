package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] carr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int num = 1;

        sb.append(carr[0]);//첫 문자 추가

        for(int i=1; i<carr.length; i++){
            if(carr[i] == carr[i-1])num++;
            else{
                if(num>1) sb.append(num); //중복된 문자가 있을경우 숫자추가
                sb.append(carr[i]); //다음문자 추가
                num=1; //num초기화
            }
        }

        //반복 끝나고 마지막 num처리
        if(num>1) sb.append(num);

        System.out.println(sb.toString());
    }
}
