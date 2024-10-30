package com.test.algo.baekjoon;

import java.io.*;

public class B10988 {

/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int answer = 1;
        int lt = 0, rt = str.length() - 1;
        char[] carr = str.toCharArray();

        while(lt<rt){
            if(carr[lt] != carr[rt]) {
                answer = 0;
                break;
            }
            lt++;
            rt--;
        }
        System.out.println(answer);
    }*/
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println((str.equals(reverse)) ? "1" : "0");
    }
}
