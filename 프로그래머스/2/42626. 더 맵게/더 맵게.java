import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            minHeap.offer(scoville[i]);
        }
        
        while(minHeap.peek() < K){
            int mix = minHeap.poll() + (minHeap.poll() * 2);
            minHeap.offer(mix);
            answer++;
            if(minHeap.size() == 1 && minHeap.peek() < K){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}