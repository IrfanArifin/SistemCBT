package CbtTest;

import javax.swing.*;

public class CbtLogin {
    public static void main(String[] args) {
        String username = "Irfan";
        String password = "2004";
        String jawaban;
        int total_Percobaan = 0;
        do{
            String Inputusername = JOptionPane.showInputDialog("username : ");
            String Inputpassword = JOptionPane.showInputDialog("password : ");

            if (username.equals(Inputusername)) {
                if (password.equals(Inputpassword)) {
                    JOptionPane.showMessageDialog(null, "selamat datang");
                    new CbtSoal().START();
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "username anda sudah benar sih tapi password salah");

                }
            } else {
                System.out.println("username salah");
            }
            jawaban = JOptionPane.showInputDialog("apakah anda ingin mencoba login lagi? (y/n)");
            total_Percobaan += 1;
        }while(jawaban.equals("y") && total_Percobaan <= 3);

        switch (total_Percobaan) {
            case 4:
                JOptionPane.showMessageDialog(null, "anda telah diblokir dari sistem kami");
                break;
        }
    }
}
