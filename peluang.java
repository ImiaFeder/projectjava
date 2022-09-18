import java.util.Scanner;

import java.util.Random;

class peluang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String huruf = "abcdefghijklmnopqrstuvwxyz";

        System.out.print("Ketik kata: ");
        String input = sc.nextLine();

        int panjang = input.length();

        Random rand = new Random();

        sc.close();
        

        int[] angkaDapat = new int[panjang];
        for(int j = 0; j == j; j++) {
            
            char ch[] = new char[panjang];
            
            for (int i = 0; i < panjang; i++) {
            
                angkaDapat[i] =  rand.nextInt(26);
                ch[i] = huruf.charAt(angkaDapat[i]);
                
                
            }
            String hasil = new String(ch);
            System.out.println("Percobaan ke-" + j+ " "+ hasil); 
            
            

            if (hasil.equals(input)) {
               
                break;
            }

            
            
        }
       

     
       



    }
}