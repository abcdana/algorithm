package com.test.algo.baekjoon.bronze;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class B25593 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String answer = "";

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> workHours = new HashMap<>();

        int[] shiftHours = {4, 6, 4, 10};

        for(int week = 0; week < N; week++){
            for(int shift = 0; shift < 4; shift++){
                String[] names = br.readLine().split(" ");
                for(String name : names){
                    if(!name.equals("-")){
                        workHours.put(name, workHours.getOrDefault(name, 0) + shiftHours[shift]);
                    }
                }
            }
        }

        if(workHours.isEmpty()){
            answer = "Yes";
        } else {
            int maxHour = Collections.max(workHours.values());
            int minHour =Collections.min(workHours.values());

            if(maxHour - minHour <= 12){
                answer = "Yes";
            }else{
                answer = "No";
            }
        }

        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();

    }
}
