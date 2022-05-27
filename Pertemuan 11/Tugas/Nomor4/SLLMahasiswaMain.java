package Tugas.Nomor4;

import java.util.Scanner;
class NodeMahasiswa {
    String nim, nama;
    int absen;
    double ipk;
    NodeMahasiswa next;
    
    NodeMahasiswa(String nim, String nama, int absen, double ipk, NodeMahasiswa berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = berikutnya;
    }
}

class SLLMahasiswa {
    NodeMahasiswa head;
    NodeMahasiswa tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if (!isEmpty()){
            NodeMahasiswa tmp = head;
            int urut = 0;
            System.out.println("Mahasiswa: ");
            while (tmp != null){
                System.out.println("Mahasiswa ke- " + urut + " : " + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                tmp = tmp.next;
                urut++;
            }
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void antrianDepan(){
        if (!isEmpty()){
            NodeMahasiswa tmp = head;
            System.out.println("Mahasiswa Terdepan : " + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void antrianBelakang(){
        if (!isEmpty()){
            NodeMahasiswa tmp = head;
            while (tmp != null){
                if (tmp == tail){
                    System.out.println("Mahasiswa Terbelakang : " + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
                }
                tmp = tmp.next;
            }
        } else{
            System.out.println("Antrian Masih Kosong");
        }
    }
    public void tambahData(String nim, String nama, int absen, double ipk){
        NodeMahasiswa ndInput = new NodeMahasiswa (nim, nama, absen, ipk, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void cariDataIndex(int index){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong");
        } else{
            NodeMahasiswa tmp = head;
            for (int i = 0; i < index; i++){
                tmp = tmp.next;
            }
            System.out.println("Mahasiswa Pada Index Ke- " + index + " adalah: " + tmp.nim + " " + tmp.nama + " " + tmp.absen + " " + tmp.ipk);
        }
    }
    public void remove(){
        if (isEmpty()){
            System.out.println("Antrian Masih Kosong, Tidak Dapat Dihapus!");
        } else if (head == tail){
            head = tail = null;
        } else{
            NodeMahasiswa temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}

public class SLLMahasiswaMain{
    public static void main(String[] args){
        SLLMahasiswa sll = new SLLMahasiswa();
        Scanner sc = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        char pilih;
        int menu;
        do{
            System.out.println("Pilih Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data Terakhir");
            System.out.println("3. Cek mahasiswa terdepan");
            System.out.println("4. Cek mahasiswa terbelakang");
            System.out.println("5. Mencari Data Mahasiswa Melalui Index");
            System.out.println("6. Tampilkan Data");
            System.out.print("Pilihanmu: ");
            menu = sc.nextInt();
            System.out.println("");
            
            switch(menu){
                case 1:{
                    do{
                        System.out.print("NIM: ");
                        String nim = sc.next();
                        System.out.print("Nama: ");
                        String nama = sc.next();
                        System.out.print("Absen: ");
                        int absen = sc.nextInt();
                        System.out.print("IPK: ");
                        double ipk = sc.nextDouble();
                        System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                        pilih = sc.next().charAt(0);
                        sll.tambahData(nim, nama, absen, ipk);
                        System.out.println("");
                    } while (pilih == 'y' || pilih == 'Y');
                } 
                break;
                case 2:{
                    sll.remove();
                    System.out.println("");
                }
                break;
                case 3:{
                    sll.antrianDepan();
                    System.out.println("");
                }
                break;
                case 4:{
                    sll.antrianBelakang();
                    System.out.println("");
                }
                break;
                case 5:{
                    System.out.print("Masukkan Index Pada Data Yang Dicari: ");
                    int idx = sc.nextInt();
                    sll.cariDataIndex(idx);
                    System.out.println("");
                }
                break;
                case 6:{
                    sll.print();
                    System.out.println("");
                }
                break;
            }
        } while (menu > 0 && menu < 6);
    }
}
