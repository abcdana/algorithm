package com.test.inflearnLecture.arry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] ranks = new int[n];

        for(int i=0; i<n; i++){
            int rank = 1;
            for(int j=0; j<n; j++){
                if(arr[i] < arr[j]) rank++;
            }
            ranks[i] = rank;
        }

        for(int num : ranks){
            System.out.print(num + " ");
        }
    }


}
