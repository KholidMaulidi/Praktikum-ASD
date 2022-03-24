import java.util.Scanner;
class pangkat{
	public int nilai, pangkat;

	pangkat(int n, int p){
		nilai= n;
		pangkat =p;
	}

	public int pangkatBF(int a, int b){
		int hasil =1;
		for(int i =0; i<b; i++){
			hasil = hasil *a;
		}
		return hasil;
	}

	public int pangkatDC(int a, int b){
		if(b==0){
			return 1;
		} else{
			if(b%2==1){
				return (pangkatDC(a, b/2)*pangkatDC(a, b/2)*a);
			} else {
				return (pangkatDC(a, b/2)*pangkatDC(a, b/2));
			}
		}
	}
}

public class pangkatMain{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("======================================");
		System.out.print("Masukkan jumlah elemen yang ingim dihitung: ");
		int elemen = sc.nextInt();
		pangkat[] p1 = new pangkat[elemen]; 
		for(int i=0; i<elemen; i++){
			System.out.print("Masukkan nilai yang akan dipangkatkan: ");
			int bil = sc.nextInt();
			System.out.print("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
			int png = sc.nextInt();
			p1[i] = new pangkat(bil, png);
		}
		int noFitur;
       
    	System.out.println("Fitur-fitur : \n(01) Fitur Hitung menggunakan Brute Force\n(02) Fitur Hitung menggunakan Divide Conquer");
   	 	System.out.println("\nSilahkan Pilih Fitur dengan Memasukkan Nomor Fitur :");
    	System.out.println("(Inputkan angka 00 untuk mengakhiri program)");
       
    	noFitur = sc.nextInt();
    	System.out.println(" ");
        
    	if(noFitur==01){
        	System.out.println("=======================================");
			System.out.println("Hasil pangkat dengan Brute Force");
			for(int i=0; i<elemen; i++){
			System.out.println("Nilai " + p1[i].nilai + " pangkat "+ p1[i].pangkat + " adalah " + p1[i].pangkatBF(p1[i].nilai, p1[i].pangkat));
			}
    	}else if(noFitur==02){
        	System.out.println("=======================================");
			System.out.println("Hasil pangkat dengan Divide Conquer");
			for(int i=0; i<elemen; i++){
			System.out.println("Nilai " + p1[i].nilai + " pangkat "+ p1[i].pangkat + " adalah " + p1[i].pangkatDC(p1[i].nilai, p1[i].pangkat));
			}
    	}else if(noFitur==03){
        
    	}else{
        System.out.println("Nomor fitur yang Anda masukkan invalid!\n");
    	}
		
		System.out.println("=======================================");
	}
}