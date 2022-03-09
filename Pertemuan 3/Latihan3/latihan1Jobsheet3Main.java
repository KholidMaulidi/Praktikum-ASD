import java.util.Scanner;
class kubus{
	int sisi;
	
	int hitungLuasP(){
		int luasP = 6*(sisi*sisi);
		return luasP;
	}
	int hitungVolume(){
		int vol = sisi*sisi*sisi;
		return vol;
	}
}

class balok{
	int p, l, t;

	int hitungLuasPB(){
		int luasPB = 2*((p*l)+(p*t)+(l*t));
		return luasPB;
	}
	int hitungVolumeB(){
		int volumeB = p*l*t;
		return volumeB;
	}
}

class tabung{
	double jariJari, tinggi;

	double hitungLPT(){
		double luasLPT = 2*3.14*jariJari*(jariJari+tinggi);
		return luasLPT;
	}

	double hitungVolumeT(){
		double volumeT = 3.14*(jariJari*jariJari)*tinggi;
		return volumeT;
	}
}
public class latihan1Jobsheet3Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.print("Masukkan banyak kubus: ");
		x = sc.nextInt();
		kubus k1[] = new kubus[x];
		for(int i=0; i<k1.length; i++){
			k1[i] = new kubus();
			System.out.println("Kubus ke-" + (i+1));
			System.out.print("Sisi: ");
			k1[i].sisi = sc.nextInt();
			System.out.println("volume kubusnya adalah " + k1[i].hitungVolume());
			System.out.println("Luas permukaan kubus adalah " + k1[i].hitungLuasP());
			System.out.println(" ");
		}

		System.out.println(" ");

		System.out.print("Masukkan banyak balok: ");
		y = sc.nextInt();
		balok b1[] = new balok[y];
		for(int i=0; i<b1.length; i++){
			b1[i] = new balok();
			System.out.println("Balok ke-" + (i+1));
			System.out.print("Panjang: ");
			b1[i].p = sc.nextInt();
			System.out.print("Lebar: ");
			b1[i].l = sc.nextInt();
			System.out.print("Tinggi: ");
			b1[i].t = sc.nextInt();
			System.out.println("volume baloknya adalah " + b1[i].hitungVolumeB());
			System.out.println("Luas permukaan kubus adalah " + b1[i].hitungLuasPB());
			System.out.println(" ");
		} 
		
		System.out.println(" ");

		System.out.print("Masukkan banyak tabung: ");
		z = sc.nextInt();
		tabung t1[] = new tabung[z];
		for(int i=0; i<t1.length; i++){
			t1[i] = new tabung();
			System.out.println("Tabung ke-" + (i+1));
			System.out.print("Jari-Jari: ");
			t1[i].jariJari = sc.nextDouble();
			System.out.print("Tinggi: ");
			t1[i].tinggi = sc.nextDouble();
			System.out.println("Volume Tabungnya adalah " + t1[i].hitungVolumeT());
			System.out.println("Luas permukaan Tabungnya adalah " + t1[i].hitungLPT());
			System.out.println(" ");
		}
		
	}
}