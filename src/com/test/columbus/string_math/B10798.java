package com.test.columbus.string_math;

import javax.management.monitor.StringMonitorMBean;
import java.io.*;

public class B10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Character[][] arr = new Character[5][15];

        for(int i = 0; i < 5; i++){
            String line = br.readLine();
            int len = line.length();
            for(int j = 0; j < len; j++){
                arr[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(arr[i][j] != null){
                    sb.append(arr[i][j]);
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
