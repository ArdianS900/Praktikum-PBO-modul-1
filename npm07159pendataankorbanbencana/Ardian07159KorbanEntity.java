package npm07159pendataankorbanbencana;

import java.util.Date;

public class Ardian07159KorbanEntity {

    String Ardian07159_nama, Ardian07159_pekerjaan, Ardian07159_goldarah,
            Ardian07159_agama, Ardian07159_jeniskelamin, Ardian07159_nik, Ardian07159_notelp, Ardian07159_bantuan;
    int Ardian07159_indexstatus;
    Date Ardian07159_TanggalLahir;

    public Ardian07159KorbanEntity(String Ardian07159_nama, String Ardian07159_kerja,
            String Ardian07159_goldar, String Ardian07159_agama,
            String Ardian07159_gender, String Ardian07159_bantuan, String Ardian07159_nik,
            String Ardian07159_notelp, Date Ardian07159_tanggal, int Ardian07159_indexstatus) {
        this.Ardian07159_nama = Ardian07159_nama;
        this.Ardian07159_pekerjaan = Ardian07159_kerja;
        this.Ardian07159_goldarah = Ardian07159_goldar;
        this.Ardian07159_agama = Ardian07159_agama;
        this.Ardian07159_jeniskelamin = Ardian07159_gender;
        this.Ardian07159_bantuan = Ardian07159_bantuan;
        this.Ardian07159_nik = Ardian07159_nik;
        this.Ardian07159_notelp = Ardian07159_notelp;
        this.Ardian07159_TanggalLahir = Ardian07159_tanggal;
        this.Ardian07159_indexstatus = Ardian07159_indexstatus;
    }
}
