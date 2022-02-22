import java.util.Scanner;
public class perulanganNim{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan NIM Anda: ");
		int nim = sc.nextInt();
		System.out.print("Masukkan Nilai n: ");
		int n = sc.nextInt();
		
		int x =1;
		String hari;
		
		for(int i=1; i<=n; i++){
			if(x==1){
				hari = "senin";
				System.out.print(" "+hari);
				x++;
				//continue;
			}
			else if(x==2){
				hari = "selasa";
				System.out.print(" "+hari);
				x++;
				//continue;
			}
			else if(x==3){
				hari = "rabu";
				System.out.print(" "+hari);
				x++;
				//continue;
			}
			else if(x==4){
				hari = "kamis";
				System.out.print(" "+hari);
				x++;
				//continue;
			}
			else if(x==5){
				hari = "jumat";
				System.out.print(" "+hari);
				x++;
				//continue;
			}
			else if(x==6){
				hari = "sabtu";
				System.out.print(" "+hari);
				x++;
				//continue;
			}
			else{
				hari = "minggu";
				System.out.print(" "+hari);
				x=1;
				//continue;
			}
		}
	}
}