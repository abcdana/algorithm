import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            total += arr[i];
        }

        int sub = total - 100;
        int a = 0, b = 0;
        for(int n : arr){
            for(int m : arr){
                if(n + m == sub){
                    a = n;
                    b = m;
                }
            }
        }

        for(int n : arr){
            if(n != a && n != b){
                System.out.println(n);
            }
        }

    }
}
