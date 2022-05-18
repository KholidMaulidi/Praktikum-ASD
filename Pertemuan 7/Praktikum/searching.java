import java.util.Scanner;
class mahasiswa{

    int nim;
    String nama;
    int umur;
    double ipk;

    mahasiswa(int ni, String n, int u, double i){
        nim=ni;
        nama=n;
        umur=u;
        ipk=i;
    }
    void tampil(){
        System.out.println("NIM= "+nim);
        System.out.println("Nama= "+nama);
        System.out.println("Umur= "+umur);
        System.out.println("IPK= "+ipk);
    }
}
class pencarianMhs {
    mahasiswa []listMHS= new mahasiswa[5];
    int idx;
    
    void tambah(mahasiswa m ){
        if(idx< listMHS.length){
            listMHS[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !");
        }
    }
    void tampil(){
        for(mahasiswa m : listMHS){
            m.tampil();
            System.out.println("----------------------------------");
        }
    }
    
    void bubbleSort(){
        for(int i=0; i<listMHS.length-1; i++){
            for( int j=1; j<listMHS.length-i; j++){
                if(listMHS[j].nim < listMHS[j-1].nim){
                    mahasiswa tmp = listMHS[j];
                    listMHS[j] = listMHS[j-1];
                    listMHS[j-1] = tmp;
                }
            }
        }
    }

    int findSeqSearch(int cari){
        int posisi=-1;
        for(int j=0; j< listMHS.length;j++){
            if(listMHS[j].nim==cari){
                posisi=j;
            }

        }
        return posisi;
    }
    void tampilposisi(int x, int pos){
        if(pos!=-1){
            System.out.println("data: " + x + " ditemukan pada indeks "+ pos);
        }else{
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
    void tampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("NIM\t : "+x);
            System.out.println("Nama\t : "+listMHS[pos].nama);
            System.out.println("Umur\t : "+listMHS[pos].umur);
            System.out.println("IPK\t : "+listMHS[pos].ipk);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari==listMHS[mid].nim){
                return (mid);
            }else if(listMHS[mid].nim>cari){
                return findBinarySearch(cari, left, mid-1);
            }else{

                return findBinarySearch(cari, mid+1, right);
            }

        }
        return -1;
    }

}

public class searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
       
        int jumMhs = 5;

        pencarianMhs data = new pencarianMhs();

        System.out.println("----------------------------------------------");
        //System.out.println("Masukkan data mahasiswa secara Urut dari NIM terkecil");
        for(int i=0; i<jumMhs; i++){
            System.out.println("---------------------");
            System.out.print("NIM\t : ");
            int nim= s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.bubbleSort();
        data.tampil();

        System.out.println("_______________");
        System.out.println("_______________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("===========================================");
        System.out.println("Menggunkan binary search");
        posisi= data.findBinarySearch(cari, 0, jumMhs-1);
        data.tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}