package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.HashMap;

public class B29701 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] arr = input.split(" ");

        HashMap<String, Character> morseToChar = new HashMap<>();

        morseToChar.put(".-", 'A');
        morseToChar.put("-...", 'B');
        morseToChar.put("-.-.", 'C');
        morseToChar.put("-..", 'D');
        morseToChar.put(".", 'E');
        morseToChar.put("..-.", 'F');
        morseToChar.put("--.", 'G');
        morseToChar.put("....", 'H');
        morseToChar.put("..", 'I');
        morseToChar.put(".---", 'J');
        morseToChar.put("-.-", 'K');
        morseToChar.put(".-..", 'L');
        morseToChar.put("--", 'M');
        morseToChar.put("-.", 'N');
        morseToChar.put("---", 'O');
        morseToChar.put(".--.", 'P');
        morseToChar.put("--.-", 'Q');
        morseToChar.put(".-.", 'R');
        morseToChar.put("...", 'S');
        morseToChar.put("-", 'T');
        morseToChar.put("..-", 'U');
        morseToChar.put("...-", 'V');
        morseToChar.put(".--", 'W');
        morseToChar.put("-..-", 'X');
        morseToChar.put("-.--", 'Y');
        morseToChar.put("--..", 'Z');
        morseToChar.put(".----", '1');
        morseToChar.put("..---", '2');
        morseToChar.put("...--", '3');
        morseToChar.put("....-", '4');
        morseToChar.put(".....", '5');
        morseToChar.put("-....", '6');
        morseToChar.put("--...", '7');
        morseToChar.put("---..", '8');
        morseToChar.put("----.", '9');
        morseToChar.put("-----", '0');
        morseToChar.put("--..--", ',');
        morseToChar.put(".-.-.-", '.');
        morseToChar.put("..--..", '?');
        morseToChar.put("---...", ':');
        morseToChar.put("-....-", '-');
        morseToChar.put(".--.-.", '@');

        StringBuilder sb = new StringBuilder();

        for(String str : arr){
            sb.append(morseToChar.get(str));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
