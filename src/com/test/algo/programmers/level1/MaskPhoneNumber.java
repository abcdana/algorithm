package com.test.algo.programmers.level1;

public class MaskPhoneNumber {

    public static String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i <= phone_number.length()-5; i++){
            answer += "*";
        }
        for (int i = phone_number.length()-4; i <= phone_number.length()-1; i++) {
            answer += phone_number.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        String num = "01011112222";
        System.out.println(solution(num));

    }
}
