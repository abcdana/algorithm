package com.test.algo.baekjoon.bronze;

import java.io.*;

public class B1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str;
        while(!(str = br.readLine()).equals("0")) {
            String reverse = sb.append(str).reverse().toString();

            if (str.equals(reverse)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
