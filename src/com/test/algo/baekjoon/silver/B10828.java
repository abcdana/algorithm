package com.test.algo.baekjoon.silver;

import java.io.*;
import java.util.LinkedList;

public class B10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                stack.addFirst(num);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.removeFirst() + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (command.equals("empty")) {
                bw.write((stack.isEmpty() ? "1" : "0") + "\n");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.getFirst() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}