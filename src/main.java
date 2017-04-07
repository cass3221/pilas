import java.util.Scanner;

public class main {

	private nodo cima;
	
	
	
	public static void main(String[] args) {
		int a = 0;
		char resp = 's';
		Scanner s1 = new Scanner(System.in);
		while(resp == 's'){
			a = opcion();
			switch(a){
				case 1: 
					
			}
			System.out.println("si desea continuar en el sistema ingrese 's' ");
			resp = s1.next().charAt(0);
		}
	}
	
	public static int opcion(){
		int b = 0;
		Scanner s1 = new Scanner(System.in);
		do{
			System.out.println("ingrese la opcion deseada: ");
			System.out.println("1: carga nodo");
			System.out.println("2: muestra");
			System.out.print("opcion? \t");
			b = s1.nextInt();
		}while((b<1)||(b>2));
		return b;
	}

}
