import java.util.Scanner;
public class fungsiHitungRumus{
	public static void main(String[] args){
		tampilMenu();
	}
	static double v,s,t;
	static void tampilMenu(){
		Scanner fitur=new Scanner(System.in);
        
        int noFitur;
       
        System.out.println("Fitur-fitur aplikasi : \n(01) Fitur Hitung Kecepatan\n(02) Fitur Hitung Jarak\n(03) Fitur Hitung Waktu");
        System.out.println("\nSilahkan Pilih Fitur dengan Memasukkan Nomor Fitur :");
        System.out.println("(Inputkan angka 00 untuk mengakhiri program)");
       
        noFitur = fitur.nextInt();
        System.out.println(" ");
        
        if(noFitur==01){
            hitungKecepatan();
        }else if(noFitur==02){
            hitungJarak();
        }else if(noFitur==03){
            hitungWaktu();
        }else if(noFitur==00){
            
        }else{
            System.out.println("Nomor fitur yang Anda masukkan invalid!\n");
            tampilMenu();
        }
	}
	static void hitungKecepatan(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai s: ");
		s = sc.nextDouble();
		System.out.print("Masukkan Nilai t: ");
		t = sc.nextDouble();

		v = s/t;
		System.out.println("nilai v: " + v);

		System.out.println(" ");

		tampilMenu();
	}

	static void hitungJarak(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai v: ");
		v = sc.nextDouble();
		System.out.print("Masukkan Nilai t: ");
		t = sc.nextDouble();

		s = v*t;
		System.out.println("nilai s: " + s);

		System.out.println(" ");

		tampilMenu();
	}

	static void hitungWaktu(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai s: ");
		s = sc.nextDouble();
		System.out.print("Masukkan Nilai v: ");
		v = sc.nextDouble();

		t = s/v;
		System.out.println("nilai t: " + t);

		System.out.println(" ");

		tampilMenu();
	}
}