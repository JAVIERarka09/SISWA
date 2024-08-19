package siswajava;

//Driver Class
    public class SiswaTester {
        public static void main(String[] args) {
            //membuat Object
            //namaClass namaObject = new
            //constructor();
            Siswa arka = new Siswa();
            Siswa widi = new Siswa();
            Siswa fadli = new Siswa();
            Siswa royan = new Siswa();
            Siswa altaf = new Siswa();
            
            arka.id = 17;
            arka.nama = "arka";
            arka.ipk = 9.99;
            widi.id = 34;
            widi.nama = "widi";
            widi.ipk = 8.88;
            fadli.id = 19;
            fadli.nama = "fadli";
            fadli.ipk = 9.99;
            royan.id = 1;
            royan.nama = "royan";
            royan.ipk = 99.9;
            altaf.id = 2;
            altaf.nama = "altaf";
            altaf.ipk = 99.9;

            arka.print();
            widi.print();
            fadli.print();
            royan.print();
            altaf.print();

        }
    
}
