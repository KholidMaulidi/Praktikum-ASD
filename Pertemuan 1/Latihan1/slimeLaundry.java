public class slimeLaundry{
	public static void main(String[] args){
		hitungPendapatan();
	}
	static int [] beratBaju = {4, 15, 6, 11};
	static String nama[] = {"Ani", "Budi", "Bina", "Cita"};
	static double totPerOrang=0;
	static double totPendapatan;

	static void hitungPendapatan(){
		for(int i=0; i<1; i++){
			totPerOrang=0;
			for(int j=0; j<4; j++){
				totPerOrang = beratBaju[j]*4500;
				if(beratBaju[j]>10){
					totPerOrang-= (totPerOrang*0.005);
				}
				totPendapatan+=totPerOrang;
				System.out.println(nama[j] + " = " + totPerOrang);
			}
		}
		System.out.println("Total Pendapatan Slime Laundry: " + totPendapatan);
	}
}