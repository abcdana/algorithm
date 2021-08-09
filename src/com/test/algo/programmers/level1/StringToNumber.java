package com.test.algo.programmers.level1;

public class StringToNumber {

    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        String s = "-1234";

        System.out.println(solution(s));

    }

}
