import java.util.Scanner;
public class M3Q14{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] array1 = new int[n][n];
        int[][] array2 = new int[n][n];
        int tmp = 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    array1[i][j] = tmp++;
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    array1[i][j] = tmp++;
                }
            }
        }
        tmp = 1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    array2[j][i] = tmp++;
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    array2[j][i] = tmp++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}