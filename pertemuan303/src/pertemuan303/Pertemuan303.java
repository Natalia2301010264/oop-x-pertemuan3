/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan303;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Pertemuan303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String pilih;
     Scanner dtIN = new Scanner(System.in);
            
     System.out.print("Pilih menu A/B/C: ");
     pilih = dtIN.nextLine();
     switch (pilih) {
            case "A":
                System.out.println("Memilih Menu A");
                break;
            case "B":
                System.out.println("Memilih Menu B");
                break;
            case "C":
                System.out.println("Memilih Menu C");
                break;
            default:
               System.out.println("Pilihan di Luar Menu A/B/C");
        }
    }
    
}
