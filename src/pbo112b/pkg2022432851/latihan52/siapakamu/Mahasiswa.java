
package pbo112b.pkg2022432851.latihan52.siapakamu;


public class Mahasiswa extends Manusia {
    private String nim,kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar dikelas PBO2");
        
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
        
    }
    
}
