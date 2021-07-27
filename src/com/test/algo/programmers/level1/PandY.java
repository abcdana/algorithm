package com.test.algo.programmers.level1;

import java.util.Objects;

public class PandY {

    public static boolean solution(String s) {
        boolean answer = true;
        int p = 0, y = 0;

        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i);

            if (index == 80 || index == 112) p++;
            else if (index == 89 || index == 121) y++;
        }

        if (p == y) return true;
        else return false;

    }

    public static void main(String[] args) {
        String s = "pPooYy";
        System.out.println(solution(s));
    }
}
