import java.util.*;
public class M3Q1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        String[] array = n.split("");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i].charAt(0));
        }
        System.out.println();
    }
}