
package javaneilsya;

import java.util.Arrays;
public class Pertemuan3 {
    public static void hasilArray (){
        int [] angka = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("================= ARRAY 1-10 =================");
        System.out.println("Nilai Yang Didapat : " + Arrays.toString(angka));
    }
    public static void totalArrayGenap(){
        System.out.println("============== TOTAL ARRAY GENAP ==============");
        int total = 0;
        int angkaGenap[] = {2,4,6,8,10};
        for(int i = 0; i < 5; i++){
            total = total + angkaGenap[i];
        }
        System.out.println("Jumlah Total :" + total);
    }
    public static void jumlahAngkaGenapGanjil(){
        System.out.println("========== Jumlah Angka Genap Ganjil ==========");
        int genap = 0, ganjil = 0;
         int [] angka = {1,2,3,4,5,6,7,8,9,10};
         for(int i = 0; i<angka.length; i++){
             if(i % 2 ==0){
                 genap++;
             }else{
                 ganjil++;
             }
         }
         System.out.println("Jumlah Angka Genap : " + genap++);
         System.out.println("Jumlah Angka Ganjil : " + ganjil++);
        }   
    public static void pengelompokanGenapGanjil(){
       int angka[] = {1,2,3,4,5,6,7,8,9,10};
       System.out.println("========== PENGELOMPOKAN GENAP GANJIL ==========");
       System.out.print(" GANJIL : ");
        for (int i = 0; i < 10; i++){
          if(angka[i] % 2 != 0){
              System.out.print(angka[i]+ " " );             
          }     
        }
        System.out.println(" ");
        System.out.print(" GENAP  : ");
        for (int j = 0; j < 10; j++){
          if(angka[j] % 2 == 0){
              System.out.print(angka[j]+ " " );       
        }
        }
                System.out.println(" ");
    }
    public static void main (String[] args){
        hasilArray();
        totalArrayGenap();
        jumlahAngkaGenapGanjil();
        pengelompokanGenapGanjil();

    }
    
}