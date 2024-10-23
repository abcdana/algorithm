package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c == '#') sb.append("1");
            else if(c == '*') sb.append("0");
        }

        String num = sb.toString();

        //sb 초기화
        sb = new StringBuilder();

        for(int i=0; i<num.length()-1; i=i+7){
            int decimal = Integer.parseInt(num.substring(i, i+7), 2);
            char c = (char) decimal;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
