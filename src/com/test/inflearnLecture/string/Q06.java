package com.test.inflearnLecture.string;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            //System.out.println(input.charAt(i) + " " + i + " " + input.indexOf(input.charAt(i)));
            if(i == input.indexOf(input.charAt(i))){
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
}
