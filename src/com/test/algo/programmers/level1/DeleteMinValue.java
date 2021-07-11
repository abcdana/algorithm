package com.test.algo.programmers.level1;

public class DeleteMinValue {

    public static int[] solution(int[] arr) {
        int[] answer = new int[0];
        int min = 0;
        int j = 0;

        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;

        } else {

            answer = new int[arr.length-1];

            for(int i = 0; i < arr.length-1; i++){
                min = (arr[i] < arr[i+1]) ? arr[i] : arr[i+1];

                if (min != arr[i]){

                    answer[j] = arr[i];

                    System.out.printf("arr[%d] = %d\n", i, arr[i]);
                    System.out.printf("answer[%d] = %d\n", j, answer[j]);

                }
                j++;
            }

            System.out.println("------------------------");
            for(int n : answer) System.out.printf("answer[%d] = %d\n", j, answer[j-1]);

           return answer;
        }

        //System.out.println(min);
            //return answer;

    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] answer = new int[0];

        solution(arr);

        for (int i=0; i<answer.length-1; i++){
            System.out.println(answer[i]);
        }


    }

}
