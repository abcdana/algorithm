package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        bw.write( a > b ? ">" : a < b ? "<" : "==");

        bw.flush();
        bw.close();
        br.close();
    }

}
