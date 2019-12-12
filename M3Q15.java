import java.util.*;
public class M3Q15{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        int[][] array1 = new int [x1][y1];
        int[][] array2 = new int [x2][y2];
        int[][] array_answer = new int [x1][y2];
        for(int i=0;i<x1;i++){
            for(int j=0;j<y1;j++){
                array1[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<x2;i++){
            for(int j=0;j<y2;j++){
                array2[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<x1;i++){
            for(int j=0;j<y2;j++){
                int tmp = 0;
                for(int k=0;k<y1;k++){
                    tmp += array1[i][k] * array2[k][j];
                }
                array_answer[i][j] = tmp;
            }
        }
        for(int i=0;i<x1;i++){
            for(int j=0;j<y2;j++){
                System.out.print(array_answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
