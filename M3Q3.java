import java.util.*;
public class M3Q3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [][] array = new int [7][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<7;j++){
                array[j][i] = scn.nextInt();
            }
            
        }
        for(int i=0;i<7;i++){
            for(int j=0;j<5;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
