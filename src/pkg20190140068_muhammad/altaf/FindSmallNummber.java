package angkaterkecil;

import java.util.Arrays; 
import java.util.Scanner; 


public class angkaterkecil {

    
 public static void main(String[] args) { 
        
        Scanner key = new Scanner(System.in);   
        System.out.println("Mencari Angka Terkecil");  
        
        boolean repeat; 
        repeat = true;  
        String index = ""; 
        String ulang; 
        while(repeat){
            
            if(!"2".equals(index)){
                System.out.println("================================="); 
                System.out.print("Masukkan Banyak Angka :");
                int n = key.nextInt();
                int[] list = new int[n];
                int min = 0;
                for(int i = 0; i <n;i++){
                    System.out.print("Masukkan Angka ke-" + (i+1) + " :");
                    list[i] = key.nextInt();
                    min = list[0];
                    if(list[i]<min){
                        min = list[i];
                    }
                    index = "2";
                }
                System.out.println("di dalam list :" + Arrays.toString(list));
                System.out.println("angka terkecilnya adalah :" + min);
                System.out.println("================================="); 
                System.out.print("Apakah kamu ingin mengulang(y/t):");
            }
            if("2".equals(index)){
                ulang = key.nextLine();
                if("t".equals(ulang)){
                    repeat = false;
                }
                else if("y".equals(ulang)){
                    index = "1";
                }
            }
        }
    }   
}