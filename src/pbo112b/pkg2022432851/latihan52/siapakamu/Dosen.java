
package pbo112b.pkg2022432851.latihan52.siapakamu;


public class Dosen extends Manusia {
    private String nip,mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
     public void mengajarApa(){
         System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang "
                 + " mengajar matakuliah PBO");
         
     }
     
    @Override
     public void siapaKamu(){
         System.out.println("Saya Dosen");
         
     }
    
}
