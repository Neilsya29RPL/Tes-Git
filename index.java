/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayperulagan;

/**
 *
 * @author MOKLET-1
 */
public class Arrayperulagan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean zonaHijau = true;
        String arrayString [] = {",","Pakai masker","Cek suhu tubuh","Cuci tangan","Siap handsanitizer","Jaga jarak","Jaga imun"};
        
        if(true){
        System.out.println("Jika Zona Hijau Masuk Sekolah");
        }
        
        //perulangan
        for(int i=1;i<arrayString.length;i++){
            System.out.println(i+"."+arrayString[i]);
        }
    }  
}
