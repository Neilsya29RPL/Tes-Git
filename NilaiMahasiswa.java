/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai.mahasiswa;

/**
 *
 * @author MOKLET-1
 */
import java.util.Scanner;

public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kehadiran, tugas , UTS, UAS;
        double Nilaiakhir;
        Scanner input = new Scanner(System.in);
        
       System.out.print("Masukkan nilai kehadiran :");
       kehadiran = input.nextInt();
       System.out.print("Masukkan nilai tugas :");
       tugas = input.nextInt();
       System.out.print("Masukkan nilai UTS :");
       UTS = input.nextInt();
       System.out.print("Masukkan nilai UAS :");
       UAS = input.nextInt();
       
       System.out.println("====================");
       Nilaiakhir = (kehadiran*0.1)+(tugas*0.2)+(UTS*0.3)+(UAS*0.4);
       System.out.println("Nilai akhir =" + Nilaiakhir);
       
    }
    
}
