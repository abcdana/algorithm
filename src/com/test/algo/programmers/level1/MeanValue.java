package com.test.algo.programmers.level1;

public class MeanValue {

    static class Solution {

        public static double solution(int[] arr) {
            double answer = 0;
            int total = 0;

            for(int i = 0; i < arr.length; i++){
                total += arr[i];
            }

            return (double) total / arr.length;
        }

        public static void main(String[] args) {

            int arr[] = {1,2,3,4};

            System.out.println(solution(arr));

        }
    }


}
