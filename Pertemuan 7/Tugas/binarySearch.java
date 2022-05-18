import java.util.Scanner;
class data{
	int array;
	int max;
	data(int a){
		array = a;
	}

	void tampil(){
		System.out.print(array);
	}
}

class pencarianData{
	data dt[] = new data[10];
	public int idx;
	public int max;

	void tambah(data d){
		if(idx<dt.length){
			dt[idx] = d;
			idx++;
		} else{
			System.out.println("Data sudah penuh!!");
		}
	}

	void tampil(){
		for(data d : dt){
			d.tampil();
			System.out.println("");
		}
	}

	int findBinarySearch(int cari, int left, int right){
		int mid;
		if(right>= left){
			mid = (left + right)/2;
			if(cari==dt[mid].array){
				return(mid);
			} else if(dt[mid].array>cari){
				return findBinarySearch(cari, left, mid-1);
			} else{
				return findBinarySearch(cari, mid +1, right);
			}
		}
		return -1;
	}

	void tampilPosisi(int x, int pos){
		if(pos!= -1){
			System.out.println("data : " + x + " ditemukan pada indeks " + pos);
		} else {
			System.out.println("data " + x + " tidak ditemukan");
		}
	}

	void tampilData(int x, int pos){
		if(pos!= -1){
			System.out.println("Array : " + x);
			System.out.println("Array : " + dt[pos].array);
		} else{
			System.out.println("data " + x + " tidak ditemukan");
		}
	}

	void bubbleSort(){
		for(int i=0; i<dt.length-1; i++){
			for( int j=1; j<dt.length-i; j++){
				if(dt[j].array < dt[j-1].array){
					data tmp = dt[j];
					dt[j] = dt[j-1];
					dt[j-1] = tmp;
				}
			}
		}
	}

	void arrayMax(){
        int pos=0, pos1=0;
        int jum=0;
        for(int i =0; i<dt.length; i++){
            max = dt[0].array;
            if(dt[i].array>dt[0].array){
                max = dt[i].array;
            }
            pos = findBinarySearch(max, 0, dt.length-1);
            pos1 = findBinarySearch(max, pos+1, dt.length-1);
        }
        System.out.println("Nilai terbesar: " + max);

        for(int i=0; i<dt.length; i++){
            if(max==dt[i].array){
                jum++;
            }
        }
        System.out.println("Jumlah nilai data terbesar ada: "+jum);
        
        if(jum>1){
        	System.out.println("Nilai " + max + " ada pada indeks " + pos + " dan " + pos1);	
        }
    }
    
}

public class binarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		pencarianData dattebayo = new pencarianData();
		int jumData = 10;

		for(int i=0; i<jumData; i++){
			int array = sc.nextInt();

			data d = new data(array);
			dattebayo.tambah(d);
		}

		System.out.println("---------------------");
		System.out.println("Data keseluruhan");
		dattebayo.bubbleSort();
		dattebayo.tampil();
		
		System.out.println("---------------------");
		
		System.out.println("Pencarian Data");
		System.out.print("Masukkan data yang akan dicari: ");
		
		int cari = sc.nextInt();
		
		System.out.println("---------------------");
		System.out.println("Menggunakan Binary Search");

		int posisi = dattebayo.findBinarySearch(cari, 0, jumData-1);
		dattebayo.tampilPosisi(cari, posisi);
		dattebayo.tampilData(cari, posisi);
		dattebayo.arrayMax();
	}
}