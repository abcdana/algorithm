package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.HashMap;

public class B27160 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] fruits = new int[4];

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int num = Integer.parseInt(input[1]);
            if(input[0].equals("STRAWBERRY")) fruits[0] += num;
            else if(input[0].equals("BANANA")) fruits[1] += num;
            else if(input[0].equals("LIME")) fruits[2] += num;
            else fruits[3] += num;
        }

        boolean bell = false;
        for (int f : fruits) {
            if (f == 5) {
                bell = true;
                break;
            }
        }

        bw.write(bell ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }

/*   public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> fruit = new HashMap<>();

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            fruit.put(input[0], fruit.getOrDefault(input[0],0) + Integer.parseInt(input[1]));
        }

        //..한 종류 이상의 과일이 정확히 5개 있는 경우 종을 눌러야 한다.
        boolean bell = false;
        for (int count : fruit.values()){
            if (count == 5){
                bell = true;
                break;
            }
        }

        bw.write((bell) ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }*/
}
