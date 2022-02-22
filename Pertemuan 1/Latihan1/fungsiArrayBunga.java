public class fungsiArrayBunga{
	public static void main(String[]  args){
		tampilStock();
		tampilStockBunga();
	}
	static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawarr"};
	static int royalGarden[][] = {
			{10,5,15,7},
			{6,11,9,12},
			{2,10,10,5},
			{5,7,12,9}};
	static String[] cabang = {"royalGarden1", "royalGarden2", "royalGarden3", "royalGarden4"};
	static void tampilStock(){
		for(int i=0; i<namaBunga.length; i++){
			System.out.print(" \t\t" + namaBunga[i]);
		}
			

		System.out.println(" ");

		for(int i=0; i<royalGarden.length; i++){
			System.out.print(" "+ cabang[i]);
			//System.out.println(" ");
			for(int j=0; j<4; j++){
				System.out.print(" \t\t" + royalGarden[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	static void tampilStockBunga(){
		int jAglonema=0, jKeladi=0, jAlocasia=0, jMawar=0;
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
	}
}