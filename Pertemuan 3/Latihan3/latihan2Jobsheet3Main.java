import java.util.Scanner;
class latihan2Jobsheet3{
	int panjang;
	int lebar;

	int hitungLuas(){
		int luas = panjang* lebar;
		return luas;
	}
}

public class latihan2Jobsheet3Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Jumlah tanah: ");
		n = sc.nextInt();
		latihan2Jobsheet3[] tnArray = new latihan2Jobsheet3[n];
		
		for(int i=0; i<n; i++){
			tnArray[i] = new latihan2Jobsheet3();
			System.out.println("Tanah " + (i+1));
			System.out.print("Panjang: ");
			tnArray[i].panjang = sc.nextInt();
			System.out.print("Lebar: ");
			tnArray[i].lebar = sc.nextInt();
		}

		for(int i=0; i<tnArray.length; i++){
			System.out.println("Luas Tanah " + (i+1) + ": " + tnArray[i].hitungLuas());
		}

		int max = 0;
		int j = 0;
		for(int i=0; i<tnArray.length; i++){
			if(tnArray[i].hitungLuas() > max){
				max = tnArray[i].hitungLuas();
				j = i+1;
			}
		}
		System.out.println("Tanah terluas: Tanah " + j); 
	}
}