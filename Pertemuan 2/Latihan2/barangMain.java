 class barang{
	String namaBarang, jenisBarang;
	int stok, hargaSatuan;

	barang(){

	}

	barang(String nm, String jn, int st, int hs){
		namaBarang = nm;
		jenisBarang = jn;
		stok = st;
		hargaSatuan = hs;
	}

	void tampilBarang(){
		System.out.println("Nama = "+namaBarang);
		System.out.println("Jenis = "+jenisBarang);
		System.out.println("Stok = " + stok);
		System.out.println("Harga Satuan = " + hargaSatuan);
	}
	void tambahStok(int n){
		stok = stok +n;
	}
	void kurangiStok(int n){
		stok = stok-n;
	}
	int hitungHargaTotal(int jumlah){
		return  jumlah*hargaSatuan;
	}
}

public class barangMain{
	public static void main(String[] args){
		barang b1 = new barang();
		b1.namaBarang = "Corsair 2 GB";
		b1.jenisBarang = "DDR";
		b1.hargaSatuan = 250000;
		b1.stok = 10;
		b1.tambahStok(1);
		b1.kurangiStok(3);
		b1.tampilBarang();
		int hargaTotal = b1.hitungHargaTotal(4);
		System.out.println("Harga 4 buah = " + hargaTotal);

		barang b2 = new barang("Logitech", "Wireless", 25, 150000);
		b2.tampilBarang();

		barang b3 = new barang("Lenovo", "laptop", 10, 6000000);
		b3.tampilBarang();
	}
}