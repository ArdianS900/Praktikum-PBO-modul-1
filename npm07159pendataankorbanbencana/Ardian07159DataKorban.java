  
package npm07159pendataankorbanbencana;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ardian07159DataKorban {
    private ArrayList <Ardian07159KorbanEntity> datakorban =new ArrayList();
    Scanner Ardian07159_input = new Scanner (System.in);
   Ardian07159StatusEntity data1 = new Ardian07159StatusEntity();
    
    public void Ardian07159_Korban(String Ardian07159_nama, String Ardian07159_kerja, 
               String Ardian07159_goldar, String Ardian07159_agama, 
               String Ardian07159_gender, String Ardian07159_bantuan, String Ardian07159_nik,
               String Ardian07159_notelp, Date Ardian07159_tanggal,int Ardian07159_indexstatus){
    datakorban.add(new Ardian07159KorbanEntity(Ardian07159_nama,Ardian07159_kerja,Ardian07159_goldar,
            Ardian07159_agama,Ardian07159_gender,Ardian07159_bantuan,Ardian07159_nik,Ardian07159_notelp,
           Ardian07159_tanggal,Ardian07159_indexstatus));
    }
    public void Ardian07159_view (){
    System.out.println("\n DATA TERKINI KORBAN BENCANA");
    System.out.println(" ===========================");
    for(int i=0;i<datakorban.size();i++){
            System.out.println("NIK = "+datakorban.get(i).Ardian07159_nik);
            System.out.println("Nama = "+datakorban.get(i).Ardian07159_nama);
            System.out.println("Pekerjaan = "+datakorban.get(i).Ardian07159_pekerjaan);
            System.out.println("No Telp = "+datakorban.get(i).Ardian07159_notelp);
            System.out.println("Tanggal Lahir = "+new SimpleDateFormat("dd-MM-"
                    + "yyyy").format(datakorban.get(i).Ardian07159_TanggalLahir));
            System.out.println("Jenis Kelamin = "+datakorban.get(i).Ardian07159_jeniskelamin);
            System.out.println("Golongan Darah = "+datakorban.get(i).Ardian07159_goldarah);
            System.out.println("Agama = "+datakorban.get(i).Ardian07159_agama);
            System.out.println("Bantuan Yang Diberikan = "+datakorban.get(i).Ardian07159_bantuan);
            System.out.println("Status = "+data1.Ardian07159_Status
                    [datakorban.get(i).Ardian07159_indexstatus]);
        }
    }
    private int carinik(String Ardian07159_indeks){
        int index=-1;
        for(int i=0;i <datakorban.size();i++) {
           if(Ardian07159_indeks.equals(datakorban.get(i).Ardian07159_nik))
               index=i;
       }
       return index;
    }
     public void Ardian07159_hapus(String Ardian07159_indeks){
        if(carinik(Ardian07159_indeks)!=-1){
             datakorban.remove(carinik(Ardian07159_indeks));
             System.out.println("Data Terhapus");
          }else{
              System.out.println("Data tidak ditemukan");
          }        
    }
    public void Ardian07159_update(String Ardian07159_indeks){
        if(carinik(Ardian07159_indeks)!=-1){
        
            System.out.print("Update Bantuan = ");
            String bantuanbaru=Ardian07159_input.next();
            datakorban.get(carinik(Ardian07159_indeks)).Ardian07159_bantuan=bantuanbaru;
        }
        else {
            System.out.println("Data tidak Ditemukan");
        }
    }
  }