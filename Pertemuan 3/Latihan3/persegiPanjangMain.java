import java.util.Scanner;
class persegiPanjang{
	public int panjang;
	public int lebar;
}	

public class persegiPanjangMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Masukkan panjang array: ");
		n = sc.nextInt();
		persegiPanjang[] ppArray = new persegiPanjang[n];
		ppArray[0] = new persegiPanjang();
		ppArray[0].panjang = 110;
		ppArray[0].lebar =30;
		
		ppArray[1] = new persegiPanjang();
		ppArray[1].panjang = 80;
		ppArray[1].lebar =40;

		ppArray[2] = new persegiPanjang();
		ppArray[2].panjang = 100;
		ppArray[2].lebar = 20;

		System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
		System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
		System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);

		for(int i=0; i<3; i++){
			ppArray[i] = new persegiPanjang();
			System.out.println("Persegi Panjang ke-" +i);
			System.out.print("Masukkan Panjang: ");
			ppArray[i].panjang = sc.nextInt();
			System.out.print("Masukkan Lebar: ");
			ppArray[i].lebar = sc.nextInt();
		}

		for(int i=0; i<3; i++){
			System.out.println("persegi Panjang ke-" +i);
			System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
		}
	}
}
