package com.test.algo.programmers.level1;

public class PickAndAdd {

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        int a = 0, b = 0;

        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] != numbers[i+1]){

            }

            answer[i] = a + b;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};
//        int[] numbers = {5,0,2,7};

        System.out.println(solution(numbers));

    }


}
