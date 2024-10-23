package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String answer = "";

        String upperStr = input.toUpperCase();

        int lt = 0, rt = upperStr.length()-1;
        char[] carr = upperStr.toCharArray();

        while (lt<rt){
            if(carr[lt] == carr[rt]){
                answer = "YES";
            } else {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        System.out.println(answer);

    }
}
