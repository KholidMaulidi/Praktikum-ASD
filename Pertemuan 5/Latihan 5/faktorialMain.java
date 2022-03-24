import java.util.Scanner;
class faktorial{
	public double nilai;

	public double faktorialBF(double n){
		double fakto = 1;
		for(int i =1; i<=n; i++){
			fakto = fakto *i;
		}
		return fakto;
	}

	public double faktorialDC(double n){
		if(n==1){
			return 1;
		}
		else{
			double fakto =n * faktorialDC(n-1);
			return fakto;
		}
	}
}

public class faktorialMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
		int elemen = sc.nextInt();
		faktorial[] fk = new faktorial[elemen];
		for(int i =0; i<elemen; i++){
			fk[i] = new faktorial();
			System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
			fk[i].nilai = sc.nextDouble();
		}
		long start = System.currentTimeMillis();
		System.out.println("===========================");
		System.out.println("Hasil faktorial dengan brute force");
		for(int i=0; i<elemen; i++){
			System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
		}
		long end = System.currentTimeMillis();
		long elapsedtime = end-start;
		System.out.println("Waktu " + String.valueOf(elapsedtime)+ " ms");
		long start1 = System.currentTimeMillis();
		System.out.println("============================");
		System.out.println("Hasil faktorial dengan divide and conquer");
		for(int i=0; i<elemen; i++){
		 	System.out.println("faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDC(fk[i].nilai));
		}
		long end1 = System.currentTimeMillis();
		long elapsedtime1 = end1-start1;
		System.out.println("Waktu " + String.valueOf(elapsedtime1)+ " ms");
		System.out.println("============================");
	}
}