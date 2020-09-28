/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author MOKLET-1
 */
import java.util.Arrays;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipedata [] nama = {Komponen - Komponen}
        //assignment
        int [] arrayInteger = {1,2,3,4,5};
        System.out.println(arrayInteger [0]);
        System.out.println(arrayInteger [1]);
        System.out.println(arrayInteger [2]);
        System.out.println(arrayInteger [3]);
        System.out.println(arrayInteger [4]);
        //atau
        System.out.println("Nilai yang didapat = " + Arrays.toString(arrayInteger));
        
        //Jumlah nilai
        for(int i = 0; i < arrayInteger.length ; i++);{
        System.out.println("Jumlah Nilai = " +arrayInteger.length);
        
        //looping for each
        for (int nilai : arrayInteger){
            System.out.println("Nilai = " + nilai);
        }
        
        
        
       
    }
                
        
    }
    
}
