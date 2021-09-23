class warnet {
    String nama_warnet, alamat, nomor_telepon ;
    Integer id_warnet ;
   
    public warnet(int id_warnet, String nama_warnet, String alamat, String nomor_telepon){
        this.id_warnet = id_warnet ;
        this.nama_warnet = nama_warnet ;
        this.alamat = alamat ;
        this.nomor_telepon = nomor_telepon ;

    }
    int getIdWarnet(){
        return id_warnet ;
    }
    String getNamaWarnet(){
        return "Nama Warnet   : " + nama_warnet ;
    }
    String getAlamat(){
        return "Alamat        : " + alamat ;
    }
    String getNomorTelepon(){
        return "Nomor Telepon : " + nomor_telepon ;
    }
}

class komputer {
    String tipe_komputer, nama_komputer, harga_sewa, status ;
    int id_komputer ;

    public komputer(int id_komputer, String tipe_komputer, String nama_komputer, String harga_sewa, String status){
        this.id_komputer = id_komputer ;
        this.tipe_komputer = tipe_komputer ;
        this.nama_komputer = nama_komputer ;
        this.harga_sewa = harga_sewa ;
        this.status = status ;
    }
    int getIdKomputer(){
        return id_komputer ;
    }
    String getTipeKomputer(){
        return "Tipe Komputer : " + tipe_komputer ;
    }
    String getNamaKomputer(){
        return "Nama Komputer : " + nama_komputer ;
    }
    String setHargaSewa(){
        return "Harga Sewa    : " + harga_sewa ;
    }
    String setStatus(){
        return "Status        : " + status ;
    }
}

public class Warnetku{
    public static void main(String[] args){
        warnet Warnet1 = new warnet (1,"Warnet Ally", "Jalan Cendrawana Nomor 57 Jelbuk, Jember", "087778088900") ;
        System.out.println("```~~~ WARNET ~~~```") ;
        System.out.println("Id Warnet: "+ Warnet1.getIdWarnet());
        System.out.println(Warnet1.getNamaWarnet()) ;
        System.out.println(Warnet1.getAlamat()) ;
        System.out.println(Warnet1.getNomorTelepon()) ;
        komputer Komputer1 = new komputer (11,"Komputer Gaming", "Komputer 05", "Rp.5000", "Dipakai") ;
        System.out.println("") ;
        System.out.println("```~~~ KOMPUTER ~~~```") ;
        System.out.println("Id Komputer: "+ Komputer1.getIdKomputer());
        System.out.println(Komputer1.getTipeKomputer()) ;
        System.out.println(Komputer1.getNamaKomputer()) ;
        System.out.println(Komputer1.setHargaSewa()) ;
        System.out.println(Komputer1.setStatus()) ;
    }
}

