import java.util.*;
public class M3Q2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int n = scn.nextInt();
        rand.setSeed(n);
        int [] array = new int [43];
        for(int i=1;i<43;i++){
            array[i] = 0;
        }
        for(int i=0;i<6;i++){
            int tmp = rand.nextInt(42)+1;
            if(array[tmp] == 1){
                i--;
            } else{
                array[tmp] = 1;
                System.out.print(tmp + "\t");
            }
        }
        System.out.println();
    }
}