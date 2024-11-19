import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int[] arr = new int[26];
    
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
    
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(arr[c - 'a'] == -1){
               arr[c - 'a'] = i; 
            }
        }
        
        for(int i : arr){
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
        br.close();


            
    }
}