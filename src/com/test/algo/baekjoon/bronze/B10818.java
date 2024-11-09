package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer stk = new StringTokenizer();

        int N = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(stk.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}
