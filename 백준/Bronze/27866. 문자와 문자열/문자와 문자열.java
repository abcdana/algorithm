import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] carr = br.readLine().toCharArray();
        int index = Integer.parseInt(br.readLine()) - 1;
        
        System.out.println(carr[index]);
        br.close();
    }
    
}