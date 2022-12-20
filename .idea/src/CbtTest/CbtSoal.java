package CbtTest;

import javax.swing.*;

public class CbtSoal {
    public static void START() {

        int getjawaban1 = Integer.parseInt(JOptionPane.showInputDialog("1+1"));

        switch (getjawaban1){
            case 2:
                JOptionPane.showMessageDialog(null ,"anda benar");
                break;
            default:
                JOptionPane.showMessageDialog(null, "jawaban salah");
        }
    }
}
