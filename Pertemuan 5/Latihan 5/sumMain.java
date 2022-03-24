import java.util.Scanner;
class sum{
	int elemen[];
	int perusahaan[];
	double keuntungan[];
	double total;

	sum(int elemen, int jumPrs){
		this.elemen = new int [elemen];
		this.keuntungan = new double[elemen];
		this.perusahaan = new int[jumPrs];
		this.total = 0;
	}

	double totalBF(double arr[]){
		for(int i=0; i<elemen.length; i++){
			total = total + arr[i];
		}
		return total;
	}

	double totalDC(double arr[], int l, int r){
		if(l== r){
			return arr[l];
		} else if(l<r){
			int mid = (l+r)/2;
			double lsum = totalDC(arr, l, mid-1 );
			double rsum = totalDC(arr, mid+1, r);
			return lsum+rsum+arr[mid];
		}
		return 0;
	}
}

public class sumMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int el =0;

		System.out.println("=======================================================");
		System.out.println("Hitung Keuntungan Total");

		
		System.out.print("Masukkan jumlah perusahaan: ");
        int jmlhPrs= sc.nextInt();
        for(int i=0; i<jmlhPrs; i++){
            System.out.print("Masukkan jumlah bulan perusahaan ke-" +(i+1)+ " : ");
            int elm= sc.nextInt();
            el= elm;
        }
        sum sm = new sum(el,jmlhPrs);
        System.out.println("=========================================================");
        for(int i=0; i<jmlhPrs; i++){
            System.out.println("Keuntungan Perusahaan " +(i+1));
            for(int j=0; j<el; j++){
                System.out.print("Masukkan keuntungan perusahaan bulan ke -" +(j+1)+" = ");
                sm.keuntungan[j]= sc.nextDouble();
            }
        }

        for(int i=0; i<jmlhPrs;i++){
            System.out.println("==========================================================");
            System.out.println("Keuntungan Perusahaan " + (i+1));
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan ke-" + (i+1)+" selama " + sm.elemen[i] + " bulan adalah = " +sm.totalBF(sm.keuntungan));
            System.out.println("\n==========================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan ke-" + (i+1)+" selama " + sm.elemen[i] + " bulan adalah = " +sm.totalDC(sm.keuntungan, 0, sm.elemen[i]-1));
        }
	}
}