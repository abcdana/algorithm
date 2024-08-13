package com.test.columbus.stack_queue_linkedList;

import java.util.*;
import java.util.*;

public class B18258 {
	
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++){
            String[] command = br.readLine().split(" ");
            
            switch (command[0]) {
            case "push" :
                queue.offer(Integer.parseInt(command[1]));
                break;
            case "pop" : 
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
                break;
            case "size" : 
                sb.append(queue.size()).append("\n");
                break;
            case "empty" :
                if (queue.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
                break;
            case "front" : 
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
                break;
            case "back" : 
                if (queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(((LinkedList<Integer>)queue).getLast()).append("\n");
                }
                break;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
