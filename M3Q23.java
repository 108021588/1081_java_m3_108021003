import java.util.*;
public class M3Q23{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2;i<n/2;i++){
            int tmp = 1;
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    tmp = 0;
                }
            }
            if(tmp == 1){
                int m = n-i;
                for(int j=2;j<m;j++){
                    if(m % j == 0){
                        tmp = 0;
                    }
                }
                if(tmp == 1){
                    System.out.println(i + "+" + m );
                }
            }
        }
    }
}
