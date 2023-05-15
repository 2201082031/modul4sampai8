/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb.pkg2201082031;

/**
 *
 * @author M.ABDI
 */
public class modul71 {
   public static void main(String[] args) {
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        // Menggunakan while loop
        System.out.println("Menggunakan while loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }

        // Menggunakan do-while loop
        System.out.println("\nMenggunakan do-while loop:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);

        // Menggunakan for loop
        System.out.println("\nMenggunakan for loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
   }
}

