
package latihan2;

public class DataDiri {
    
public class datadiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;

    // Konstruktor
    public datadiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // Getter (opsional)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getKelas() {
        return kelas;
    }

    // Setter (opsional)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

}
