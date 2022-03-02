import java.util.Scanner;
class latihan2Jobsheet2{
	int x, y, width, height;

	void moveLeft(){
		x = x-1;
	}

	void moveRight(){
		x = x+1;
	}

	void moveUp(){
		y = y-1;
	}

	void moveDown(){
		y= y+1;
	}

	void printPosition(){
		for(int i=0; i<width; i++){
			for(int j=0; j<height; j++){
				if(i==y && j==x){
					System.out.print(" * ");
					j++;
				}
				if(j!=height){
					System.out.print(" . ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("Titik koordinatnya: (" +x +"," +y + ")");
		fiturMove();
	}

	void fiturMove(){
		Scanner sc = new Scanner(System.in);
		String move;

		System.out.println("Fitur Move : \n1.Press A to Move Left \n2.Press D to Move Right \n3.Press W to Move Up \n4.Press S to Move Down");
		System.out.println("Input 'Stop' untuk mengakhiri program");
		move = sc.next();

		if(move.equalsIgnoreCase("A")){
			moveLeft();
			if(x<0 || y<0 || y>=height || x>=width ){
                x=0;
                printPosition();
            }else{
                printPosition();
            }
		}
		else if(move.equalsIgnoreCase("D")){
			moveRight();
			if(x<0 || y<0 || y>=height || x>=width ){
                x=height-1;
                printPosition();
            }else{
                printPosition();
            }
		}
		else if(move.equalsIgnoreCase("W")){
			moveUp();
			if(x<0 || y<0 || y>=height || x>=width ){
                y=0;
                printPosition();
            }else{
                printPosition();
            }
		}
		else if(move.equalsIgnoreCase("S")){
			moveDown();
			if(x<0 || y<0 || y>=height || x>=width ){
                y=width-1;
                printPosition();
            }else{
                printPosition();
            }
		}
		else if(move.equalsIgnoreCase("STOP")){

		}
		else{
			System.out.println("Kode Move yang Anda Masukkan Invalid!");
			fiturMove();
		}
	}
}


public class latihan2Jobsheet2Main{
	public static void main(String[] args){
		latihan2Jobsheet2 c1 = new latihan2Jobsheet2();
		
		c1.x = 3;
		c1.y = 3;
		c1.width = 10;
		c1.height = 10;

		
		c1.fiturMove();
	}
}
