package npm07159pendataankorbanbencana;

import java.util.Date;

public class Ardian07159SistemInformasiPendataanKorbanBencana {
   
    public static void main(String[] args) {
        Ardian07159StatusEntity data1 = new Ardian07159StatusEntity();
        Ardian07159DataKorban data = new Ardian07159DataKorban();
        System.out.println("INFORMASI KORBAN BENCANA");
        int pil;
        do {
            System.out.println("\n1.Input Data Korban");
            System.out.println("2.Cetak Data");
            System.out.println("3.Hapus");
            System.out.println("4.Update");
            System.out.println("5.Exit");
            System.out.print("pilih = ");
            pil = data.Ardian07159_input.nextInt();
            switch (pil){
                case 1 :
                    System.out.print("Input NIK = ");
                    String Ardian07159_nik = data.Ardian07159_input.next();
                    System.out.print("Input Nama = ");
                    String Ardian07159_nama = data.Ardian07159_input.next();
                    System.out.print("Input Pekerjaan = ");
                    String Ardian07159_kerja = data.Ardian07159_input.next();
                    System.out.print("Input No Telp = ");
                    String Ardian07159_notelp = data.Ardian07159_input.next();
                    System.out.print("Input Tgl Lahir (mm/dd/yyyy) = ");
                    Date Ardian07159_tanggal = new Date(data.Ardian07159_input.next());
                    System.out.print("Input Jenis Kelamin = ");
                    String Ardian07159_gender = data.Ardian07159_input.next();
                    System.out.print("Input Golongan Darah = ");
                    String Ardian07159_goldar = data.Ardian07159_input.next();
                    System.out.print("Input Agama = ");
                    String Ardian07159_agama = data.Ardian07159_input.next();
                    System.out.print("Input Bantuan Yang Diberikan = ");
                    String Ardian07159_bantuan = data.Ardian07159_input.next();
                    for(int i=0;i<data1.Ardian07159_Status.length;i++){
                        System.out.println(i+". "+data1.Ardian07159_Status[i]);
                    }
                    System.out.print("Pilih Status Korban = ");
                    int Ardian07159_indexstatus = data.Ardian07159_input.nextInt();
                    
                 data.Ardian07159_Korban(Ardian07159_nama, Ardian07159_kerja, Ardian07159_goldar, 
                      Ardian07159_agama, Ardian07159_gender, Ardian07159_bantuan, Ardian07159_nik, 
                      Ardian07159_notelp, Ardian07159_tanggal, Ardian07159_indexstatus);
                    break;
                case 2 :
                    data.Ardian07159_view();
                    break;
                case 3 :
                    System.out.print("Data NIK berapa Yang ingin dihapus = ");
                    String hapus=data.Ardian07159_input.next();
                    data.Ardian07159_hapus(hapus);
                    break;
                case 4 :
                    System.out.print("Data NIK berapa Yang ingin diupdate = ");
                    String nik=data.Ardian07159_input.next();
                    data.Ardian07159_update(nik);
                    break;
            }
    }while (pil!=5);
  }  
}