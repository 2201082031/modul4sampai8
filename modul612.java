/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb.pkg2201082031;
import javax.swing.JOptionPane;
/**
 *
 * @author M.ABDI
 */
public class modul612 {
      public static void main(String[] args) {
        int ujian1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian ke-1"));
        int ujian2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian ke-2"));
        int ujian3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian ke-3"));

        int rataRata = (ujian1 + ujian2 + ujian3) / 3;
        JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian: " + rataRata);

        if (rataRata >= 60) {
            JOptionPane.showMessageDialog(null, ":-)"); // Emoji smiley
        } else {
            JOptionPane.showMessageDialog(null, ":-("); // Emoji sedih
        }
    }
}
    
