import java.util.*;
public class M3Q9{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        String[] array1 = n.split(" ");
        int[] array = new  int[array1.length];
        for(int i=0;i<array1.length;i++){
            array[i] = (int)array1[i].charAt(0) - 48;
        }
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
            }
            System.out.println();
    }
}