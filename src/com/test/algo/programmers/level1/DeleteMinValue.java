package com.test.algo.programmers.level1;

public class DeleteMinValue {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int min = 0;

        if (arr.length == 1) {
            answer[0] = -1;
        } else {
            for(int i = 0; i < arr.length-1; i++){
                min = (arr[i] < arr[i+1]) ? arr[i] : arr[i+1];

                if (arr[i] < arr[i+1]){

                }
            }

        }

        System.out.println(min);
            return answer;

    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        System.out.println(solution(arr));

    }

}
