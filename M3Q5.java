import java.util.*;
public class M3Q5{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        C(m,n);
    }

    public static void C(int m,int n){
        int ans = 1;
        for(int i = n+1;i<=m;i++){
            ans *= i;
        }
        for(int i=1;i<=m-n;i++){
            ans /= i;
        }
        System.out.println(ans);
    }
}
