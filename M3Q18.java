import java.util.*;
public class M3Q18{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        for(int i=0;i<n;i++){
            String a = scn.nextLine();
            String [] array = a.split(" ");
            for(int j=0;j<array.length;j++){
                for(int k=j+1;k<array.length;k++){
                    if((int)array[j].charAt(0) < (int)array[k].charAt(0)){
                        String tmp = array[j];
                        array[j] = array[k];
                        array[k] = tmp;
                    }else if((int)array[j].charAt(0) == (int)array[k].charAt(0)){
                        int n1 = Integer.parseInt(array[j].substring(1));
                        int n2 = Integer.parseInt(array[k].substring(1));
                        if(n1 < n2){
                            String tmp = array[j];
                            array[j] = array[k];
                            array[k] = tmp;
                        }
                    }
                }
            }
            for(int j=0;j<array.length;j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}
