import java.util.Scanner;

public class aljabarforbabies {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Format: kx+a=b \nk dan +a optional\n");
        String str = sc.nextLine();
        int nilaikonstanta =1;
        int langkah1 =0;
        double hasil=0;
        int startSamadengan = str.indexOf("=")+1;
        int endSamadengan = str.length();
        boolean cek1,cek2;
        cek1= false;
        cek2 = false;
        int startplus = str.indexOf("+") + 1 ;
        int endplus = str.indexOf("=");
        int nilaisamadengan = Integer.parseInt(str.substring(startSamadengan, endSamadengan));
        
        
        if (str.indexOf("+") != -1) {
            int nilaiplus = Integer.parseInt(str.substring(startplus,endplus));
            hasil = nilaisamadengan - nilaiplus;
            langkah1 = (int)hasil;
            cek1 = true;
        } else {
            langkah1 = nilaisamadengan;
        }

        if (str.charAt(0) != 'x') {
            int endx = str.indexOf("x");
            nilaikonstanta = Integer.parseInt(str.substring(0,endx));
            cek2 = true;
            hasil = ((double) (langkah1) ) / nilaikonstanta;
        }
       
        
        if((cek1 == false)&& (cek2 == false)) {
            hasil = nilaisamadengan;
        }

        System.out.println("x = "+ hasil);
        sc.close();
    }
}
