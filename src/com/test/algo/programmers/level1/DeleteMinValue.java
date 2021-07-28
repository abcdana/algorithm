package com.test.algo.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class DeleteMinValue {

    public static int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1){
            answer = new int[1];
            answer[0] = -1;

        } else {
            answer = new int[arr.length - 1];
            int min = 0, index = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] <= arr[j]) {
                        min = arr[i];
                    }
                }
            }
            System.out.println("min : " + min);

            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] != min){
                    answer[index] = arr[i];
                    index++;
                }
            }
        }


        for (int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,2,6};

        System.out.println(solution(arr));

    }

}
