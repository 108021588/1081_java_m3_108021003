import java.util.*;
public class M3Q7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int [n];
        for(int i=0;i<n;i++){
            array[i] = scn.nextInt();
        }
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
