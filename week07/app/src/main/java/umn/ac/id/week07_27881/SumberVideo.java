package umn.ac.id.week07_27881;

import java.io.Serializable;

public class SumberVideo implements Serializable {

    private String judul, keterangan, videoURI;

    public SumberVideo(String judul, String keterangan, String videoURI) {
        this.judul = judul;
        this.keterangan = keterangan;
        this.videoURI = videoURI;
    }

    public String getJudul() {
        return judul;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getVideoURI() {
        return videoURI;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setVideoURI(String videoURI) {
        this.videoURI = videoURI;
    }

    @Override
    public String toString() {
        return this.getJudul() + " => " + this.getKeterangan();
    }
}