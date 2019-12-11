import java.util.*;
public class M3Q27{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int n){
        if(n == 0){
            return 0;
        }else{
            return 1 + fun(n/10);
        }
    }
}
