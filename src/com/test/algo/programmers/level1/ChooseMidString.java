package com.test.algo.programmers.level1;

public class ChooseMidString {

    public static String solution(String s) {
        String answer = "";
        int index = (s.length()-1)/2;
//        System.out.println((s.length()-1)/2);
//        System.out.println(s.length());

        if (s.length() % 2 == 1){
            answer = String.valueOf(s.charAt(index));
        } else {
            answer = String.valueOf(s.charAt(index)) + String.valueOf(s.charAt(index+1));
        }

        return answer;
    }

    public static void main(String[] args) {

        String s = "abcd";

        System.out.println(solution(s));

    }
}
