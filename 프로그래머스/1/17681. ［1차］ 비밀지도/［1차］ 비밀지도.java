class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            
            int[] binary1 = new int[n];
            int[] binary2 = new int[n];
            
            int num1 = arr1[i];
            int num2 = arr2[i];
            
            for(int a = n-1; a >= 0; a--){
                binary1[a] = num1 % 2;
                num1 /= 2;
                
                binary2[a] = num2 % 2;
                num2 /= 2;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb.append((binary1[j] == 1 || binary2[j] == 1) ? "#" : " ");
            }
            answer[i] = sb.toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}
