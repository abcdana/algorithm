package com.test.algo.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class P42576 {
    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for(String par : participant){
            map.put(par, map.getOrDefault(par, 0) + 1);
        }

        for(String com : completion){
            map.put(com, map.get(com) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
