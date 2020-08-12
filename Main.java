import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //matriz
	char[][] gatito = new char [3][3];
	
	Scanner leer= new Scanner (System.in);
	boolean gano=false;
	int turno=0,x,y;
	
	for(int corX = 0;corX<3;corX++) {
   	 for(int corY = 0;corY<3;corY++) {
   		 gatito[corX][corY]= '*';
   
   	    }
      }
	System.out.println("  1  2  3");
	for(int corX = 0;corX<3;corX++) {
		System.out.print(corX+1);
	   	 for(int corY = 0;corY<3;corY++) {
	   		System.out.print("["+gatito[corX][corY]+"]");
	   
	   	    }
	   	 System.out.println("");
	      }
	do {
		
		if(turno==0) {
			 System.out.println("jugador 1 ingrese cordenada x:");
				x=leer.nextInt();
				y=leer.nextInt();
				if(x>=0 && x<=3 && y>=0 && y<=3 && gatito[x-1][y-1]=='*') {
					gatito[x-1][y-1]='X';
					turno=1;	
					
				}
				
		}else {
			System.out.println("jugador 2 ingrese cordenada x:");
			x=leer.nextInt();
			y=leer.nextInt();
			if(x>=0 && x<=3 && y>=0 && y<=3 && gatito[x-1][y-1]=='*') {
				
				gatito[x-1][y-1]='O';
			    turno=0;	
		
			}
		
		}
		System.out.println("  1  2  3");
		for(int corX = 0;corX<3;corX++) {
			System.out.print(corX+1);
		   	 for(int corY = 0;corY<3;corY++) {
		   		System.out.print("["+gatito[corX][corY]+"]");
		   
		   	    }
		   	 System.out.println("");
		      }
		
		//horizontales en x
		if(gatito[0][0]== gatito[0][1] && gatito[0][2]==gatito[0][1] && gatito[0][2]!='*'){
			gano=true;
			System.out.println("gano el jugador " + gatito[0][2]);
		}
		if(gatito[1][0]=='X' && gatito[1][1]=='X' && gatito[1][2]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		if(gatito[2][0]=='X' && gatito[2][1]=='X' && gatito[2][2]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		//verticales en x
		if(gatito[0][0]=='X' && gatito[1][0]=='X' && gatito[2][0]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		if(gatito[0][1]=='X' && gatito[1][1]=='X' && gatito[2][1]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		if(gatito[0][2]=='X' && gatito[1][2]=='X' && gatito[2][2]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		//diagonales en x
		if(gatito[0][0]=='X' && gatito[1][1]=='X' && gatito[2][2]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		if(gatito[0][2]=='X' && gatito[1][1]=='X' && gatito[2][0]=='X'){
			gano=true;
			System.out.println("gano el jugador uno ");
		}
		
		//horizontales en 0
				if(gatito[0][0]=='0' && gatito[0][1]=='0' && gatito[0][2]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				if(gatito[1][0]=='0' && gatito[1][1]=='0' && gatito[1][2]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				if(gatito[2][0]=='0' && gatito[2][1]=='0' && gatito[2][2]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				//verticales en 0
				if(gatito[0][0]=='0' && gatito[1][0]=='0' && gatito[2][0]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				if(gatito[0][1]=='0' && gatito[1][1]=='0' && gatito[2][1]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				if(gatito[0][2]=='0' && gatito[1][2]=='0' && gatito[2][2]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				//diagonales en 0
				if(gatito[0][0]=='0' && gatito[1][1]=='0' && gatito[2][2]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
				}
				if(gatito[0][2]=='0' && gatito[1][1]=='0' && gatito[2][0]=='0'){
					gano=true;
					System.out.println("gano el jugador dos ");
			   	}
				int contVacios=0;
				for(int corX = 0;corX<3;corX++) {
				   	 for(int corY = 0;corY<3;corY++) {
				   		 if(gatito[corX][corY]== '*') {
				   			 contVacios++;
				   		 }
				   
				   	    }
				      }
				if(contVacios==0) {
					System.out.println("Empate");
					gano=true;
				}
	   }while(gano==false);
	}

}
