package com.test.columbus.stack_queue_linkedList;

import java.io.*;
import java.util.Stack;

public class B9012 {

    //9012. 괄호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++){
            String str = br.readLine();
            String result = isVPS(str);
            sb.append(result);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static String isVPS(String input){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++){

            char c = input.charAt(i);

            if (c == '('){
                stack.push(c);
            } else if (c == ')'){
                if (stack.empty()){
                    return "NO\n";
                } else stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES\n";
        } else {
            return "NO\n";
        }
    }
}
