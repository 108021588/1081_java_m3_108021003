import java.util.*;
public class M3Q11{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int [n];
        for(int i=0;i<n;i++){
            array[i] = scn.nextInt();
        }
        for(int i=0;i<n;i++){
            int ans  = array[i];
            for(int j=i+1;j<n;j++){
                ans += array[j];
                if(ans==0){
                    for(int k = i;k<=j;k++){
                        System.out.print(array[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
