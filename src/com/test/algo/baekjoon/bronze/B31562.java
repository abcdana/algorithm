package com.test.algo.baekjoon.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B31562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        HashMap<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // 두 번째 줄부터 N개의 줄: 노래 제목과 일곱 개의 음이름 처리
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(stk.nextToken()); // 노래 제목의 길이 (사용 안할 수도 있음)
            String songName = stk.nextToken(); // 노래 제목
            // 첫 7개의 음을 StringBuilder에 추가
            for (int j = 0; j < 7; j++) {
                sb.append(stk.nextToken());
            }
            String melody = sb.toString(); // 멜로디 저장
            sb.setLength(0); // StringBuilder 초기화
            map.put(songName, melody); // 노래 제목과 음이름을 저장
        }


        for(int i = 0; i < M; i++){
            String start = br.readLine().replaceAll(" ", "");
            int count = 0;

            String result = "!"; // 기본값 설정

            for (String key : map.keySet()) {
                if (map.get(key).startsWith(start)) {
                    count++;
                    if (count == 1) {
                        result = key; // 첫 번째 매칭된 곡의 이름 저장
                    } else {
                        result = "?"; // 두 개 이상 매칭 시 ? 설정 후 종료
                        break;
                    }
                }
            }

            bw.write(result + "\n"); // 결과 출력
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
