package com.test.inflearnLecture.string;


import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();

        char[] arr = input.toCharArray();

        String answer = "";

        int lt = 0, rt = input.length() - 1;
        while(lt<rt){
            if(!Character.isLetter(arr[lt])){
                lt++;
            } else if (!Character.isLetter(arr[rt])) {
                rt--;
            } else if(Character.isLetter(arr[lt]) && Character.isLetter(arr[rt])){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            answer = String.valueOf(arr);
        }
        System.out.println(answer);

    }
}
