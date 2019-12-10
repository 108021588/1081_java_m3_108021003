import java.util.*;
public class M3Q12{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [] array1 = new int [n];
        int [] array2 = new int [m];
        int [] array3 = new int [n];
        for(int i=0;i<n;i++){
            array1[i] = scn.nextInt();
        }
        for(int i=0;i<m;i++){
            array2[i] = scn.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array1[i] == array2[j]){
                    int tmp = 1;
                    for(int k=0;k<ans;k++){
                        if(array1[i] == array3[k]){
                            tmp = 0;
                            break;
                        }
                    }
                    if(tmp == 1){
                        array3[ans] = array1[i];
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}