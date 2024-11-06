package com.test.algo.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class P181858 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 2, 3, 2};
        int k = 3;

        System.out.println(solution(arr, k).toString());

    }

    public static int[] solution(int[] arr, int k) {
        //int[] answer = {};
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(!answer.contains(arr[i])){
                answer.add(arr[i]);
            }
        }

        if(answer.size() < k){
            for(int i = answer.size(); i <= k; i++){
                answer.add(-1);
            }
        }

        // int[] 배열로 변환
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

}
