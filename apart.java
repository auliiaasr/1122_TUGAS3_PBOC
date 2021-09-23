class apartemen {
    String nama_apartemen, nama_pemilik, nomor_telfon, tipe_kamar ;
    int harga, total_kamar;

    public apartemen(String nama_apartemen, String nama_pemilik, String nomor_telfon, String tipe_kamar, int total_kamar, int harga){
        this.nama_apartemen = nama_apartemen;
        this.nama_pemilik = nama_pemilik;
        this.nomor_telfon = nomor_telfon;
        this.tipe_kamar = tipe_kamar;
        this.total_kamar = total_kamar;
        this.harga = harga;
    }
    String getNamaApartemen(){
        return "Nama Apartemen: " + nama_apartemen;
    }
    String setNamaPemilik(){
        return "Nama Pemilik: " +nama_pemilik;
    }
    String setNomorTelfon(){
        return "Nomor Telfon: " +nomor_telfon;
    }
    String getTipeKamar(){
        return "Tipe Kamar: " + tipe_kamar;
    }
    int getTotalKamar(){
        return total_kamar;
    }
    int setharga(){
        return harga;
    }
}

class penghuni {
    String jenis_kelamin, nama_penghuni, nomor_telfon, status;
    int usia;

    public penghuni(String jenis_kelamin, String nama_penghuni, String nomor_telfon, String status, int usia){
        this.jenis_kelamin = jenis_kelamin;
        this.nama_penghuni = nama_penghuni;
        this.nomor_telfon = nomor_telfon;
        this.status = status;
        this.usia = usia;
    }
    String getJenisKelamin(){
        return "Jenis Kelamin: "+jenis_kelamin;
    }
    String getNamaPenghuni(){
        return "Nama Penghuni: "+nama_penghuni;
    }
    String setNomorTelfon(){
        return "Nomor Telfon: "+nomor_telfon;
    }
    String setStatus(){
        return "Status Penguni: "+status;
    }
    int setUsia(){
        return usia;
    }
}

public class apart{
    public static void main(String[] args){
        apartemen Apartemen1 = new apartemen("Garden Apartemen", "Aulia Sinta", "081234567899", "Suits", 15, 2700000);
        System.out.println("=================APARTEMEN================");
        System.out.println(Apartemen1.getNamaApartemen());
        System.out.println(Apartemen1.setNamaPemilik());
        System.out.println(Apartemen1.setNomorTelfon());
        System.out.println(Apartemen1.getTipeKamar());
        System.out.println("Total Kamar: "+Apartemen1.getTotalKamar());
        System.out.println("Harga Apartemen: "+Apartemen1.setharga());
        System.out.println("__________________________________________");
        System.out.println("=================PENGHUNI================");
        penghuni Penghuni1 = new penghuni("Laki laki", "Raza Aurellio", "082134567899", "Mahasiswa", 21);
        System.out.println(Penghuni1.getJenisKelamin());
        System.out.println(Penghuni1.getNamaPenghuni());
        System.out.println(Penghuni1.setNomorTelfon());
        System.out.println(Penghuni1.setStatus());
        System.out.println("Usia Penghuni: " +Penghuni1.setUsia());
        System.out.println("__________________________________________");
    }
}