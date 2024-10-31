package com.test.algo.programmers.level2;

import java.util.HashMap;

public class P42578 {

    public static void main(String[] args) {

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
    public static int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;

        for(int count : map.values()){
            answer *= (count + 1);
        }

        return answer - 1;
    }
}
