
import java.util.Scanner;

    public class binerTodes {
    
    String binary;
    int lengt;
    public binerTodes(String bin, int size) {
        binary = bin;
        lengt = size;
    }

    
    
    public void intToArr() {
        int[] arr = new int[lengt];
        for (int i = 0; i < lengt; i++) {
            arr[i] = binary.charAt(i) - '0';
        }
      
        int j = 0;
        int desimal = 0;
        
        while ( j < lengt) {
            
            desimal += arr[lengt-1-j] * Math.pow(2, j);
            j++;
        }
        System.out.println(desimal);
    }


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String biner = scan.nextLine();

        binerTodes input = new binerTodes(biner, biner.length());

        input.intToArr();


        scan.close();
    }
}
