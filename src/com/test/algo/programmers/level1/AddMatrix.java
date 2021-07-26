package com.test.algo.programmers.level1;

public class AddMatrix {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        int i, j;

        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1[0].length; j++) {
                System.out.printf("i = %d , j = %d", i, j);
                answer[i][j] = (arr1[i][j] + arr2[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        System.out.println(solution(arr1, arr2));
    }
}
