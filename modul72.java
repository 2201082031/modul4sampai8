/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb.pkg2201082031;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author M.ABDI
 */
public class modul72 {
        public static void main(String[] args) {
        int[] numbers = new int[10];

        // Menggunakan BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Masukkan nomor ke-" + (i + 1) + ": ");
                numbers[i] = Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }

        // Mencari nomor terbesar
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        // Menampilkan nomor terbesar menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, "Nomor terbesar adalah: " + maxNumber);
    }
}

