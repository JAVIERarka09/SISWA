package siswajava;

public class Siswa {
    int id;
    String nama;
    double ipk;

    // constructor
    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }
   
    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("IPK : "+ipk);


    }
}
