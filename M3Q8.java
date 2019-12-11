import java.util.*;
public class M3Q8{
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        String[] array1 = n.split(" ");
        int[] array = new  int[array1.length];
        for(int i=0;i<array1.length;i++){
            array[i] = (int)array1[i].charAt(0) - 48;
        }
        square(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }




    public static void square(int[] array){
        for(int i=0;i<array.length;i++){
            array[i] *= array[i];
        }
    }




}