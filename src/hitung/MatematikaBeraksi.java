
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        
        Matematika azmi = new Matematika(3,7);
        
        System.out.println("Hasil penjumlahan: "+azmi.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+azmi.setPengurangan());
        System.out.println("Hasil perkalian: "+azmi.setPerkalian());
        System.out.println("Hasil pembagian: "+azmi.setPembagian());
    }
}
