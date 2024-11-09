package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int iter = Integer.parseInt(stk.nextToken());
            char[] arr = stk.nextToken().toCharArray();
            for(char c : arr){
                for(int j = 0; j < iter; j++){
                    sb.append(c);
                }
            }
            bw.write(sb.toString() + "\n");
            sb.setLength(0);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
