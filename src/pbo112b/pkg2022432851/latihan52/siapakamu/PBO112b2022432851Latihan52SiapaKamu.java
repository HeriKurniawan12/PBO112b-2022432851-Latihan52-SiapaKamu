
/**
 *
 * @author
 * Nama : Heri Kurniawan
 * Kelas : PBO112B
 * NIM : 2022432851
 * Deskripsi Program : Program ini berisi latihan 52 siapa kamu
 */
package pbo112b.pkg2022432851.latihan52.siapakamu;


public class PBO112b2022432851Latihan52SiapaKamu {

 
    public static void main(String[] args) {
        
        Dosen hki = new Dosen();
        hki.setNip("41227829930");
        System.out.println("NIP DOSEN : "+hki.getNip());
        hki.siapaKamu();
        hki.mengajarApa();
        
        
        System.out.println("");
        System.out.println("");
        
        
        Mahasiswa hki1 = new Mahasiswa();
        hki1.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+hki1.getNim());
        hki1.siapaKamu();
        hki1.kelasApa();
   
    }
    
}
