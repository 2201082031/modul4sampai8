/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb.pkg2201082031;
import java.util.Scanner;
/**
 *
 * @author M.ABDI
 */
public class modul64 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        System.out.print("Masukkan nilai pangkat: ");
        int pangkat = input.nextInt();
        
        int hasil = 1;
        
        for (int counter = 0; counter < pangkat; counter++) {
            hasil *= angka;
        }
        
        System.out.println("Hasil pangkat: " + hasil);
    }
}
