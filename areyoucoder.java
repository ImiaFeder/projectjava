import javax.swing.JOptionPane;

public class areyoucoder {
    
    public static void main (String[] args) {

        while (true) {
            String[] pilihan = {"Ya!", "Bukan!"};
            int answer = JOptionPane.showOptionDialog(null, "APAKAH KAMU PROGRAMMER?!", "PERHATIAN!!!",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null, pilihan, 0);
            if (answer == 0) {
                break;
            }
        }
        

    }
}
