package com.test.columbus.string_math;

import java.io.*;
import java.util.StringTokenizer;

public class B2609 {

    /*
    문제
    두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

    출력
    첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer input = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(input.nextToken());
        int num2 = Integer.parseInt(input.nextToken());

        int gcd = gcd(num1, num2);
        int lcm = (num1 * num2) / gcd;

        bw.write(gcd + "\n");
        bw.write(lcm + "");
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
