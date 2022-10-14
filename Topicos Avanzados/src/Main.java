import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        int rq = Integer.parseInt(br.readLine());
        String[] numsA = nums.trim().split("\\s+");
        for(int i = 0 ; i < numsA.length ; i++){
            if(rq == 0){
                if(Integer.parseInt(numsA[i]) % 2 == 0)
                    System.out.print(numsA[i] + "\t");
            }else{
                if(Integer.parseInt(numsA[i]) % 2 == 1)
                    System.out.print(numsA[i] + "\t");
            }
        }
    }
}