import java.util.*;
public class M3Q4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int h = scn.nextInt();
        f(w,h);
    }

    public static void f(int w,int h){
        for(int i=0;i<h;i++){
            int tmp = 1;
            int num = i+1;
            for(int j=0;j<w;j++){
                System.out.print(num * (tmp++) + "\t");
            }
            System.out.println();
        }
    }
}