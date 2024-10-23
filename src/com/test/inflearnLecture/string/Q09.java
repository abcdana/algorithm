package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        String answer = "";

        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                answer= String.valueOf(sb.append(c));
            }
        }
        int n = Integer.parseInt(answer);
        System.out.println(n);
    }
}
