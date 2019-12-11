import java.util.*;
public class M3Q17{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(f(n));
    }

    public static int f(int n){
        if(n == 1){
            return n+1;
        }else{
            return f(n-1) + f(n/2);
        }
    }
}
