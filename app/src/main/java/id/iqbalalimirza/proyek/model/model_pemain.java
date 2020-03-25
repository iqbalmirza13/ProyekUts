package id.iqbalalimirza.proyek.model;

import android.media.Image;

public class model_pemain {
    private String nama;
    private int foto_pemain;
    private String biodata;

    public model_pemain(){}

    public model_pemain(String nama, int foto_pemain, String biodata) {
        this.nama = nama;
        this.foto_pemain = foto_pemain;
        this.biodata = biodata;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getFoto_pemain() {
        return foto_pemain;
    }

    public void setFoto_pemain(int foto_pemain) {
        this.foto_pemain = foto_pemain;
    }

    public String getBiodata() {
        return biodata;
    }

    public void setBiodata(String biodata) {
        this.biodata = biodata;
    }
}
