class segitiga{
	public int alas;
	public int tinggi;

	public segitiga(int a, int b){
		alas = a;
		tinggi = b;
	}
	public double hitungLuas(){
		return (alas*tinggi) *0.5;
		
	}

	public double hitungKeliling(double a, double b){
		double c = Math.sqrt((a*a)+(b*b));
		double keliling = a+b+c;
		return keliling;
	}
}

public class segitigaMain{
	public static void main(String[] args){
		segitiga[] sgArray = new segitiga[4];
		sgArray[0] = new segitiga(10, 4);
		sgArray[1] = new segitiga(20, 10);             
		sgArray[2] = new segitiga(15, 6);
		sgArray[3] = new segitiga(25, 10);
		
		
		//sgArray[0].hitungLuas();
		for(int i=0; i<4; i++){
		System.out.println("segitiga ke" + (i+1));
		System.out.println("luasnya adalah " + sgArray[i].hitungLuas() + " dan kelilingnya adalah " + sgArray[i].hitungKeliling(sgArray[i].alas, sgArray[i].tinggi));
		}


	}
}