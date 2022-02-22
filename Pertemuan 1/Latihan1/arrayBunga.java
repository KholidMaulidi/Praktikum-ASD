public class arrayBunga{
	public static void main(String[] args){
		int jAglonema=0, jKeladi=0, jAlocasia=0, jMawar=0;
		int royalGarden[][] = {
			{10,5,15,7},
			{6,11,9,12},
			{2,10,10,5},
			{5,7,12,9}};

		for(int i=0; i<4; i++){
			jAglonema +=royalGarden[i][0];
		}
		System.out.println("Jumlah Stock Bunga Aglonema: " + jAglonema);
		for(int i=0; i<4; i++){
			jKeladi +=royalGarden[i][1];
		}
		System.out.println("Jumlah Stock Bunga Keladi: " + jKeladi);
		for(int i=0; i<4; i++){
			jAlocasia +=royalGarden[i][2];
		}
		System.out.println("Jumlah Stock Bunga Alocasia: " + jAlocasia);
		for(int i=0; i<4; i++){
			jMawar +=royalGarden[i][3];	          
		}
		System.out.println("Jumlah Stock Bunga Mawar: " + jMawar);

		royalGarden[0][0]-=1;
		royalGarden[0][1]-=2;
		royalGarden[0][2]-=0;
		royalGarden[0][3]-=5;

		int totAglonema=0, totKeladi=0, totAlocasia=0, totMawar=0;

		totAglonema = royalGarden[0][0]*75000;
		totKeladi = royalGarden[0][1]*50000;
		totAlocasia = royalGarden[0][2]*60000;
		totMawar = royalGarden[0][3]*10000;

		int totPenBunga1 = totAglonema+totKeladi+totAlocasia+totMawar;

		System.out.println("Total Pendapatan dari RoyalGarden1: " + totPenBunga1);
	}
}