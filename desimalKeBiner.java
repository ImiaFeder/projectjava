import java.util.Scanner;

import java.util.ArrayList;


public class desimalKeBiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double input = sc.nextDouble();
        sc.close();

        ArrayList<Integer> simpanan = new ArrayList<Integer>();
        
       
        while (true) {
            if (input > 0) {
                simpanan.add((int)input % 2);
                input = Math.floor(input/2);
            } else {
                break;
            }
            System.out.println((int)input);

        }
        
        if (input == 0) {
            System.out.println(0);
        }

        for (int i = 0; i < simpanan.size(); i++) {
            System.out.print(simpanan.get(simpanan.size()-i-1) + "");
        }
        System.out.println("");


    }
 }
