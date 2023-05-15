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
public class modul52 {
    
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Gambar 1: Masukkan kata pertama");
        String word2 = JOptionPane.showInputDialog("Gambar 2: Masukkan kata kedua");
        String word3 = JOptionPane.showInputDialog("Gambar 3: Masukkan kata ketiga");

        JOptionPane.showMessageDialog(null, word1 + " " + word2 + " " + word3, "Gambar 3: Menampilkan Pesan", JOptionPane.INFORMATION_MESSAGE);
    }
}






    
