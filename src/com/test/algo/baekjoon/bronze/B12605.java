package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class B12605 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        //StringTokenizer stk = new StringTokenizer();
        for(int i = 0; i < N; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            while(stk.hasMoreTokens()){
                stack.push(stk.nextToken());
            }
            int casenum = i+1;
            bw.write("Case #" + casenum + ": ");
            while(!stack.empty()){
                bw.write(stack.pop() + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
