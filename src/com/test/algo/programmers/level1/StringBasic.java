package com.test.algo.programmers.level1;

public class StringBasic {

    public static void main(String[] args) {
        String s = "a234";

        System.out.println(solution(s));

    }

    public static boolean solution(String s) {
        boolean answer = true;
        String s2 = "";

        if(s.length() == 4 || s.length() == 6){
            for (int i = 0; i < s.length(); i++) {
                if (48 <= s.charAt(i) && s.charAt(i) <= 57) s2 += s.charAt(i);
            }
        }
        if(s.length() != s2.length()) answer = false;

        return answer;
    }

}
