import java.util.*;
public class M3Q28{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        if(n<m){
            int tmp = n;
            n = m;
            m = tmp;
        }
        System.out.println(fun(n,m));
    }
    public static int fun(int n,int m){
        if(m == 0){
            return n;
        }else{
            return fun(m,n%m);
        }
    }
}
