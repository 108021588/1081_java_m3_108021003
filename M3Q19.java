import java.util.*;
public class M3Q19{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        String[] array = n.split("");
        int tmp = 1;
        for(int i=0;i<array.length/2;i++){
            if(array[i].charAt(0) != array[array.length-1-i].charAt(0)){
                tmp = 0;
            }
        }
        if(tmp == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
