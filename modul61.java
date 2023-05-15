/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb.pkg2201082031;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author M.ABDI
 */
public class modul61 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai ujian ke-1: ");
        int ujian1 = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan nilai ujian ke-2: ");
        int ujian2 = Integer.parseInt(reader.readLine());

        System.out.print("Masukkan nilai ujian ke-3: ");
        int ujian3 = Integer.parseInt(reader.readLine());

        int rataRata = (ujian1 + ujian2 + ujian3) / 3;
        System.out.println("Rata-rata nilai ujian: " + rataRata);

        if (rataRata >= 60) {
            System.out.println(":-)"); // Emoji smiley
        } else {
            System.out.println(":-("); // Emoji sedih
        }
    }
}
    

