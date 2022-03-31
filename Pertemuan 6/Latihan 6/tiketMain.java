class tiket{
	String maskapai;
	int harga;
	String asal;
	String tujuan;

	tiket(String m, int h, String a, String t){
		maskapai = m;
		harga = h;
		asal = a;
		tujuan = t;
	}

	void tampil(){
		System.out.println("Maskapai = " + maskapai);
		System.out.println("Harga = " + harga);
		System.out.println("Asal = " + asal);
		System.out.println("Tujuan = " + tujuan);
	}
}

class tiketService{
	tiket tikets[] = new tiket[5];
	int idx;

	void tambah(tiket t){
		if(idx<tikets.length){
			tikets[idx] = t;
			idx++;
		} else{
			System.out.println("Data sudah penuh!");
		}
	}

	void tampilAll(){
		for(tiket t : tikets){
			t.tampil();
			System.out.println("----------------------");
		}
	}

	void bubbleSort(){
		for(int i=0; i<tikets.length-1; i++){
			for(int j=1; j<tikets.length-i; j++){
				if(tikets[j].harga < tikets[j-1].harga){
					tiket tmp = tikets[j];
					tikets[j] = tikets[j-1];
					tikets[j-1] = tmp;
				}
			}
		}
	}

	void selectionSort(){
		for(int i=0; i<tikets.length-1; i++){
			int idxMin = i;
			for(int j=i+1; j<tikets.length; j++){
				if(tikets[j].harga<tikets[idxMin].harga){
					idxMin=j;
				}
			}

			tiket tmp = tikets[idxMin];
			tikets[idxMin] = tikets[i];
			tikets[i] = tmp;
		}
	}
}

public class tiketMain {
    public static void main(String[] args) {
        tiketService tm = new tiketService();
        tiket t1 = new tiket("Garuda" , 6000 , "Madura" , "Malang");
        tiket t2 = new tiket("Etihad" , 3000 , "Surabaya" , "Malang");
        tiket t3 = new tiket("Fly Emirates" , 4000 , "Jakarta" , "Malang");
        tiket t4 = new tiket("Jet" , 20000 , "Kolor" , "Malang");
        tiket t5 = new tiket("Heli" , 15000 , "New York" , "Malang");

        tm.tambah(t1);
        tm.tambah(t2);
        tm.tambah(t3);
        tm.tambah(t4);
        tm.tambah(t5);

        System.out.println("\nTiket sebelum disorting : \n");
        tm.tampilAll();
        
        System.out.println("\nTiket setelah disorting dengan bubblesort\n");
        tm.bubbleSort();
        tm.tampilAll();

        System.out.println("\nTiket setelah disorting dengan selection sort\n");
        tm.selectionSort();
        tm.tampilAll();

    }
}