import java.util.Scanner;
class mahasiswa{
	String nama;
	int thnMasuk, umur;
	double ipk;

	mahasiswa(String n, int t, int u, double i){
		nama = n;
		thnMasuk = t;
		umur = u;
		ipk = i;
	}

	void tampil(){
		System.out.println("Nama = " + nama);
		System.out.println("Tahun Masuk = " + thnMasuk);
		System.out.println("Umur = " + umur);
		System.out.println("IPK = " + ipk);
	}
}

class daftarMahasiswaBerprestasi{
	mahasiswa listMhs[] = new mahasiswa[5];
	int idx;

	void tambah(mahasiswa m){
		if(idx<listMhs.length){
			listMhs[idx] = m;
			idx++;
		} else{
			System.out.println("Data sudah penuh!!");
		}
	}

	void tampil(){
		for(mahasiswa m : listMhs){
			m.tampil();
			System.out.println("--------------------");
		}
	}

	void bubbleSort(){
		for(int i=0; i<listMhs.length-1; i++){
			for( int j=1; j<listMhs.length-i; j++){
				if(listMhs[j].ipk > listMhs[j-1].ipk){
					mahasiswa tmp = listMhs[j];
					listMhs[j] = listMhs[j-1];
					listMhs[j-1] = tmp;
				}
			}
		}
	}

	void selectionSort(){
		for(int i=0; i<listMhs.length-1; i++){
			int idxMin = i;
			for(int j=i+1; j<listMhs.length; j++){
				if(listMhs[j].ipk<listMhs[idxMin].ipk){
					idxMin=j;
				}
			}

			mahasiswa tmp = listMhs[idxMin];
			listMhs[idxMin] = listMhs[i];
			listMhs[i] = tmp;
		}
	}


	void insertionSort(boolean asc){
		for(int i=1; i<listMhs.length; i++){
			mahasiswa temp = listMhs[i];
			int j =i;
			if(asc){
				while(j>0 && listMhs[j-1].ipk > temp.ipk){
					listMhs[j] = listMhs[j-1];
					j--;
				}
			} else {
				while(j>0 && listMhs[j-1].ipk < temp.ipk){
					listMhs[j] = listMhs[j-1];
					j--;
				}
			}
			listMhs[j] = temp;
		}
	}
}

public class bubbleMain{
	public static void main(String[] args){
		daftarMahasiswaBerprestasi list = new daftarMahasiswaBerprestasi();
		mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
		mahasiswa m2 = new mahasiswa("Rara", 2012, 19, 4);
		mahasiswa m3 = new mahasiswa("Dompu", 2018, 19, 3.5);
		mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
		mahasiswa m5 = new mahasiswa("Ummi", 2019, 21, 3.75);

		list.tambah(m1);
		list.tambah(m2);
		list.tambah(m3);
		list.tambah(m4);
		list.tambah(m5);

		System.out.println("Data mahasiswa sebelum sorting= ");
		list.tampil();

		System.out.println("Data mahasiswa setelah disorting dengan BubbleSort berdasarkan ipk = ");
		list.bubbleSort();
		list.tampil();

		System.out.println("Data mahasiswa setelah disorting dengan SelectionSort berdasarkan ipk = ");
		list.selectionSort();
		list.tampil();

		System.out.println("Data mahasiswa setelah disorting dengan InsertionSort berdasarkan ipk = ");
		list.insertionSort(true);
		list.tampil();
	}
}