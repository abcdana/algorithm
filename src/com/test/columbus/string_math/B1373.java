package com.test.columbus.string_math;

import java.io.*;

public class B1373 {

    /*
    문제
    2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.

    입력
    첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.

    출력
    첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
    */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String binary = br.readLine();
        StringBuilder result = new StringBuilder();

        int length = binary.length(); // 2진법 문자 길이

        for (int i = length; i > 0; i -= 3) {

            int start = Math.max(i-3, 0);
            String chuck = binary.substring(start, i);

            int octal = Integer.parseInt(chuck, 2);
            result.insert(0, octal);
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
