import java.util.Scanner;
public class hitungNilaiAkhir{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("====Program Menghitung Nilai Akhir====");
		System.out.print("Masukkan Nilai Tugas : ");
		int tugas = sc.nextInt();
		System.out.print("Masukkan Nilai UTS : ");
		int uts = sc.nextInt();
		System.out.print("Masukkan Nilai UAS : ");
		int uas = sc.nextInt();

		double nilaiAkhir = (double)((0.2*tugas)+(0.35*uts)+(0.45*uas));
		String nilaiHuruf;
		String kelulusan;

		System.out.println("===================");
		if(nilaiAkhir>80&&nilaiAkhir<=100){
			nilaiHuruf = "A";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Lulus";
		}
		else if(nilaiAkhir>73&&nilaiAkhir<=80){
			nilaiHuruf = "B+";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Lulus";
		}
		else if(nilaiAkhir>65&&nilaiAkhir<=73){
			nilaiHuruf = "B";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Lulus";
		}
		else if(nilaiAkhir>60&&nilaiAkhir<=65){
			nilaiHuruf = "C+";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Lulus";
		}
		else if(nilaiAkhir>50&&nilaiAkhir<=60){
			nilaiHuruf = "C";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Lulus";
		}
		else if(nilaiAkhir>39&&nilaiAkhir<=50){
			nilaiHuruf = "D";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Tidak Lulus";
		}
		else{
			nilaiHuruf = "E";
			System.out.println("Nilai Huruf : " + nilaiHuruf);
			kelulusan = "Tidak Lulus";
		}
		System.out.println("===================");
		System.out.println(kelulusan);
		
	}
}