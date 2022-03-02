class latihan1Jobsheet2{
	String nama;
	int hargaSatuan, jumlah;

	int hitungHargaTotal(int a, int b){
		int hargaTotal = a*b;
		return hargaTotal;
	}

	double hitungDiskon(int a ){
		 double hDiskon = 0;
		if(a > 100000){
			hDiskon=a*0.01;
		}
		else if(a>=500000&&a<=100000){
            hDiskon=a*0.05;
        }else{
            hDiskon=0;
        }
        return hDiskon;
	}

	double hitungHargaBayar(int a, double b){
		double hBayar = a - b;
		return hBayar;
	}
}

public class latihan1Jobsheet2Main{
	public static void main(String[] args){
		latihan1Jobsheet2 c2 = new latihan1Jobsheet2();
		c2.nama = "Laptop";
		c2.hargaSatuan = 2000000;
		c2.jumlah = 1;

		System.out.println("Harga Total = " + c2.hitungHargaTotal(c2.hargaSatuan, c2.jumlah));
		System.out.println("Harga setelah diskon = " + c2.hitungDiskon(c2.hitungHargaTotal(c2.hargaSatuan, c2.jumlah)));
		System.out.println("Harga bayar = " + c2.hitungHargaBayar(c2.hitungHargaTotal(c2.hargaSatuan, c2.jumlah), c2.hitungDiskon(c2.hitungHargaTotal(c2.hargaSatuan, c2.jumlah))));
	}
}