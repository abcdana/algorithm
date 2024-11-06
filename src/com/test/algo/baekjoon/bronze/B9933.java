package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.HashSet;

public class B9933 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        HashSet<String> set = new HashSet<>();
        String answer = "";
        int length = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            String current = arr[i];
            String reverse = new StringBuilder(current).reverse().toString();

            if (set.contains(reverse)) {
                length = current.length();
                answer = current.substring(length / 2, length / 2 + 1);
                break;
            }

            set.add(current);
        }

        bw.write(length + " " + answer);

        bw.flush();
        bw.close();
        br.close();
    }
}
