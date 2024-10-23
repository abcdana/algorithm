package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();  // 입력을 바로 대문자로 변환

        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
            }
        }

        char[] eng = sb.toString().toCharArray();
        int lt = 0, rt = eng.length - 1;
        String answer = "YES";

        while(lt < rt){
            if(eng[lt] != eng[rt]){
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }

        System.out.println(answer);
    }
}
