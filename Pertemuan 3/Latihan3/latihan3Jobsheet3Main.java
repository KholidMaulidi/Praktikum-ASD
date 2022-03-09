import java.util.Scanner;
class latihan3Jobsheet3{
	String nama, jenisKelamin;;
	int nim;
	double ipk;
}

public class latihan3Jobsheet3Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Masukkan panjang array: ");
		n = sc.nextInt();
		latihan3Jobsheet3[] mhArray = new latihan3Jobsheet3[n];

		for(int i=0; i<n; i++){
			mhArray[i] = new latihan3Jobsheet3();
			System.out.println("Masukkan data mahasiswa ke- " + (i+1));
			System.out.print("Masukkan nama: ");
			mhArray[i].nama = sc.next();
			System.out.print("Masukkan nim: ");
			mhArray[i].nim = sc.nextInt();
			System.out.print("Masukkan jenis Kelamin: ");
			mhArray[i].jenisKelamin = sc.next();
			System.out.print("Masukkan IPK: ");
			mhArray[i].ipk = sc.nextDouble();
			System.out.println(" ");
		}

		for(int i=0; i<mhArray.length; i++){
			System.out.println("Data mahasiswa ke-"+i);
			System.out.println("Nama: " + mhArray[i].nama);
			System.out.println("NIM: " + mhArray[i].nim);
			System.out.println("Jenis Kelamin: " + mhArray[i].jenisKelamin);
			System.out.println("IPK: " + mhArray[i].ipk);
		}
	}
}