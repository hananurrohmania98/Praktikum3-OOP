public class MahasiswaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Mahasiswa anton = new Mahasiswa();
        Manager Hana = new Manager();
        Programmer Egi = new Programmer();

        /* memanggil atribut dan memberi nilai */
        anton.setNim("10102020");
        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";
        anton.setJurusan("Informatika");
        System.out.println("Nim           : " + anton.getNim());
        System.out.println("Jurusan       : " + anton.getJurusan());

        //memanggil pegawai Manager
        Hana.setNama("Hana Nur Rohmania");
        Hana.setGajiPokok(3000000);
        Hana.setTunjangan(500000);

        //memanggil pegawai Programmer
        Egi.setNama("Egi Pratama");
        Egi.setGajiPokok(4000000);
        Egi.setBonus(1000000);


        anton.cetakInfo();
        Hana.cetakInfo();
        Egi.cetakInfo();
    }

}
