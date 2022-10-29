
import java.util.Scanner;

//program transpos matriks
public class transpos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("baris : ");
        int baris = scan.nextInt();
        System.out.print("kolom : ");

        int kolom = scan.nextInt();
        int[][] arr0 = new int[baris][kolom];
        String[] simpanan = new String[baris];
        String[][] simpanan1 = new String[baris][kolom];
        int r = 0;
        System.out.println("");
        while (r < baris) {

            System.out.print("Baris ke - " + (r + 1) + " : ");
            simpanan[r] = scan.next();
            simpanan1[r]= simpanan[r].split("x");

            r++;

        }
        
        
        System.out.println("");

        scan.close();

        for (int q = 0; q < baris; q++) {
            for (int w = 0; w < kolom; w++) {
                arr0[q][w] = Integer.parseInt(simpanan1[q][w]);
            }
        }

        for (int i = 0; i < (int) arr0.length; i++) {
            for (int j = 0; j < arr0[0].length; j++) {
                System.out.print(arr0[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");

        int[][] arrT = new int[(int) arr0[0].length][(int) arr0.length];

        for (int b = 0; b < arr0[0].length; b++) {
            for (int x = 0; x < arr0.length; x++) {

                arrT[b][x] = arr0[x][b];
                System.out.print(arrT[b][x] + " ");
            }
            System.out.println("");
        }

    }

}
