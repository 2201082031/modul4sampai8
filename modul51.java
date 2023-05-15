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
public class modul51 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter word1: ");
        String word1 = reader.readLine();

        System.out.print("Enter word2: ");
        String word2 = reader.readLine();

        System.out.print("Enter word3: ");
        String word3 = reader.readLine();

        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
    
