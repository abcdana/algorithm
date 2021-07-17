package com.test.algo.programmers.level1;

import java.util.Calendar;

public class Year2026 {

    public static String solution(int a, int b) {
        String answer = "";

        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);

        int dayNum = cal.get(Calendar.DAY_OF_WEEK);

        answer = days[dayNum-1];

        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        System.out.println(solution(a, b));

    }
}
