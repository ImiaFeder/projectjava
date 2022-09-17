import javax.swing.JOptionPane;

public class kamuwibugak {
    
    public static void main (String[] args) {

        while (true) {
            String[] pilihan = {"Ya!", "Bukan!"};
            int bro = JOptionPane.showOptionDialog(null, "KAMU WIBU YA?!", "PERHATIAN!!!",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null, pilihan, 0);
            if (bro == 0) {
                break;
            }
        }
        

    }
}
