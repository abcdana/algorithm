package com.test.algo.programmers.level1;

import java.util.HashMap;

public class P81301 {

    public static void main(String[] args) {

        System.out.println(solution("one4seveneight"));
    }

    public static int solution(String s) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        StringBuilder result = new StringBuilder();
        StringBuilder tmp = new StringBuilder();

        for(char c : s.toCharArray()) {
            tmp.append(c);
            String tmpWord = tmp.toString();
            if(Character.isDigit(c)){
                result.append(c);
                tmp.setLength(0);
            }else{

                if(map.containsKey(tmpWord)) {
                    result.append(map.get(tmpWord));
                    tmp.setLength(0); // tmp 초기화하여 다음 단어 생성 준비
                }
            }
        }

        // result가 비어있는 경우를 방지하기 위한 예외 처리
        if (result.length() == 0) {
            return 0; // 변환된 숫자가 없으면 0 반환 (문제에 맞게 변경 가능)
        }

        answer = Integer.parseInt(result.toString());

        return answer;
    }
}
