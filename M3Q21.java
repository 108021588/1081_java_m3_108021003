import java.util.*;
public class M3Q21{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int [][] array = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j] = scn.nextInt();
            }
        }
            int [] array1 = new int [8];
            int times = 0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    array1[times] += array[i][j];
                }
                times++;
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    array1[times] += array[j][i];
                }
                times++;
            }
            array1[6] = array[0][0] + array[1][1] + array[2][2];
            array1[7] = array[0][2] + array[1][1] + array[2][0];
            int tmp = 1;
            for(int i=0;i<8;i++){
                if(array1[i] == 0 || array1[i] == 3){
                    tmp = 0;
                    break;
                }
            }
            if(tmp == 1){
                System.out.println("False");
            }else{
                System.out.println("True");
            }
    }
}
