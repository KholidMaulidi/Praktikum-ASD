# Laporan Praktikum Jobsheet 8
### Kholid Maulidi
### 1G/ 16/ 2141720139

## subbab 8.2
1. Agar front dan rear tidak ada data harus bernilai -1, jika mereka bernilai 0 maka front dan rear ada di indeks 0 yang mana itu sudah memiliki nilai, sedangkan size nya masih 0 atau tidak ada raung
2.     if (rear == max - 1) {
            rear = 0;
        }
**Jika rear ada di index terakhir dari array maka rear nya akan di set ke 0, jadi rear tidak akan melewati batas maksimal dari indeks array**

3. Jika front ada di index terakhir dari array maka front nya akan di set ke 0, jadi front tidak akan melewati batas maksimal dari indeks array
4. Ya karena bisa saja indeks terdepan bukan indeks 0, indeks terdepan adalah front jadi yang di tampilkan adalah dimulai dari indeks front
5. Jadi ini iterasi untuk mengeprint data pada array. Ketika i sudah pada indeks paling terakhir dari array, i akan kembali ke 0.
6.      System.out.print("Masukkan data baru: ");
        int dataMasuk = sc.nextInt();
        Q.Enqueue(dataMasuk);
        break;

        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        }
7.      int Enqueue(int dt) {
            if (IsFull()) {
                System.out.println("Queue sudah penuh");
                return 0;
            } else {
                if (IsEmpty()){
                    front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return 1;
            }
        }
    **main**
        
        case 1:
            System.out.print("Masukkan data baru: ");
            int dataMasuk = sc.nextInt();
            pilih = Q.Enqueue(dataMasuk);
            break;
        case 2:
            int dataKeluar = Q.Dequeue();
            if (dataKeluar != 0) {
                System.out.println("Data yang dikeluarkan: " + dataKeluar);
                break;
            } else {
                pilih = dataKeluar;
                break;
            }
    **hasil output**

    <img src = img/1.jpg>

## subbab 8.3
1. Ketika masuk ke case 2 dan data[front] mempunyai isi atau tidak sama dengan kosong, maka sistem akan mengprint data yang telah didequeue tersebut
2.      void peekRear() {
            if (!IsEmpty()) {
                System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
                + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
            } else {
                System.out.println("Queue masih kosong");
            }
            }   
    **Main**
    
        public static void menu() {
            System.out.println("Pilih Menu:");
            System.out.println("1. Antrian Baru");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Semua Antrian");
            System.out.println("5. Cek Antrian Paling Belakang");
            System.out.println("-------------------");
        }

        case 5:
            antri.peekRear();
            break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    **output**

    <img src = img/2.jpg>

## tugas 
1.      void peekPosition(int dataDicari) {
            int i = front;
            int posisi = 1;
            System.out.print("data " + dataDicari + " ada pada posisi : ");
            while(i != rear) {
                if (data[i]==dataDicari){
                System.out.print(posisi + " ");
                }
                i = (i+1) % max;
                posisi++;
            }
            if (data[i] == dataDicari){
            System.out.print(posisi + " ");
            }   
            System.out.println();
        }

        void peekAt(int position) {
            int idxDicari = front;
            System.out.print("Data pada posisi " + position + " adalah : ");
            for (int i = 0 ; i < position - 1 ; i++){
                idxDicari = (idxDicari + 1) % max;
            }
            System.out.println(data[idxDicari] + " ");
    **output**
    
    <img src = img/3.jpg>
    
    <img src = img/4.jpg>

2.      class Mahasiswa {
            String nim, nama;
            int absen;
            double ipk;

            Mahasiswa(String nim, String nama, int absen, double ipk) {
                this.nim = nim;
                this.nama = nama;
                this.absen = absen;
                this.ipk = ipk;
            }

            Mahasiswa(){
        
            }
        }   
        class Queue {
            Mahasiswa[] data;
            int front;
            int rear;
            int size;
            int max;

            Queue(int n) {
                max = n;
                data = new Mahasiswa[max];
                size = 0;
                front = rear = -1;
            }

            boolean IsEmpty() {
                if (size == 0) {
                    return true;
                } else {
                    return false;
                }
            }

            boolean IsFull() {
                if (size == max) {
                    return true;
                } else {
                    return false;
                }
            }

            void peek() {
                if (!IsEmpty()) {
                    System.out.println("Elemen terdepan: " + data[front].nim + " " + data[front].nama + " "+ " " + data[front].absen + " " + data[front].ipk);
                } else {
                    System.out.println("Queue masih kosong");
                }
            }

            void print() {
                if (IsEmpty()) {
                    System.out.println("Queue masih kosong");
                } else {
                    int i = front;
                    while (i != rear) {
                        System.out.println(data[i].nim + " " + data[i].nama + " "+ " " + data[i].absen + " " + data[i].ipk);
                        i = (i + 1) % max;
                    }
                    System.out.println(data[i].nim + " " + data[i].nama + " "+ " " + data[i].absen + " " + data[i].ipk);
                    System.out.println("Jumlah elemen = " + size);
                }
            }

            void clear() {
                if (!IsEmpty()) {
                    front = rear = -1;
                    size = 0;
                    System.out.println("Queue berhasil dikosongkan");
                } else {
                    System.out.println("Queue masih kosong");
                }
            }

            void Enqueue(Mahasiswa dt) {
                if (IsFull()) {
                    System.out.println("Queue sudah penuh");
                } else {
                    if (IsEmpty()) {
                    front = rear = 0;
                    } else {
                        if (rear == max - 1) {
                            rear = 0;
                        } else {
                            rear++;
                        }
                    }
                    data[rear] = dt;
                    size++;
                }
            }

            Mahasiswa Dequeue() {
                Mahasiswa dt = new Mahasiswa();
                if (IsEmpty()) {
                    System.out.println("Queue masih kosong");
                } else {
                    dt = data[front];
                    size--;
                    if (IsEmpty()) {
                        front = rear = -1;
                    } else {
                        if (front == max - 1) {
                            front = 0;
                        } else {
                            front++;
                        }
                    }
                }
                return dt;
            }

            void peekRear() {
                if (!IsEmpty()) {
                    System.out.println("Elemen terbelakang: " + data[rear].nim + " \n" + data[rear].nama + " "+ " \n" + data[rear].absen + " \n" + data[rear].ipk);
                } else {
                    System.out.println("Queue masih kosong");
                }
            }

            void peekPosition(String dataDicari) {
                int i = front;
                int posisi = 1;
                System.out.print("data " + dataDicari + " ada pada posisi : ");
                while(i != rear) {
                    if (data[i].nim.equals(dataDicari)){
                        System.out.print(posisi + " ");
                    }
                    i = (i+1) % max;
                    posisi++;
                }
                if (data[i].nim.equals(dataDicari)){
                    System.out.print(posisi + " ");
                }
                System.out.println();
            }

            void peekAt(int position) {
                int idxDicari = front;
                System.out.print("Data pada posisi " + position + " adalah : ");
                for (int i = 0 ; i < position - 1 ; i++){
                    idxDicari = (idxDicari + 1) % max;
                }

                System.out.println(data[idxDicari].nim + " \n" + data[idxDicari].nama + " "+ " \n" + data[idxDicari].absen + " \n" + data[idxDicari].ipk);
            }
        }

        import java.util.Scanner;
        public class tugasJs8No2 {
            public static void menu() {
                System.out.println("Pilih Menu:");
                System.out.println("1. Antrian Baru");
                System.out.println("2. Antrian Keluar");
                System.out.println("3. Cek Antrian Terdepan");
                System.out.println("4. Cek Semua Antrian Mahasiswa");
                System.out.println("5. Cek Antrian Paling Belakang");
                System.out.println("6. Cari Posisi Mahasiswa Berdasarkan NIM");
                System.out.println("7. Cari data Mahasiswa Berdasarkan Posisi");
                System.out.println("-------------------");
            }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan kapasitas queue: ");
            int jumlah = sc.nextInt();
            Queue antri = new Queue(jumlah);
            int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa nb = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0
                            && data.ipk != 0) {
                        System.out.println("Data yang dikeluarkan: " + data.nim + " " + data.nama 
                                + " " + data.absen + " " + data.ipk);
                        break;
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang ingin dicari : ");
                    String dataDicari = sc.nextLine();
                    antri.peekPosition(dataDicari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi Mahasiswa yang ingin dicari : ");
                    int posDicari = sc.nextInt();
                    antri.peekAt(posDicari);
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
    }

    <img src = img/5.jpg>
    
    <img src = img/6.jpg>   
    