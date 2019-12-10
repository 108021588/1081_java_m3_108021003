import java.util.*;
public class M3Q10{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[6];
        for(int i=0;i<n;i++){
            array[i] = scn.nextInt();
        }
        int ans = array[0];
        for(int i=0;i<n;i++){
            int tmp = 1;
            for(int j=i;j<n;j++){
                tmp *= array[j];
                if(tmp > ans){
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }
}