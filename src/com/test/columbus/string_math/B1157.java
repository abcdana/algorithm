package com.test.columbus.string_math;

import java.io.*;
public class B1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String binary = br.readLine();

        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);

        bw.write(octal);
        bw.flush();
        bw.close();
        br.close();


    }
}
