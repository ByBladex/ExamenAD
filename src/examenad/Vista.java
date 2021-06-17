package examenad;

import java.util.Scanner;

public class Vista {

	Scanner scanner = new Scanner(System.in);
	
	public static void mostrar(String string) {
		System.out.println(string);
	}
	
	public int cargarMenu(String... opciones) { //Con los ... deja introducir varios string
		Integer opcion = 0;
		
		for(int i=0;i<opciones.length;i++) {
			System.out.println((i+1)+"-"+opciones[i]);
		}
		System.out.println((opciones.length+1)+"-"+"Salir");
		
		while(opcion<1 || opcion>opciones.length+1) {
			System.out.println("\nIntroduzca una opcion: ");
			opcion = scanner.nextInt();
		}
		
		return opcion;
	}
	
	public int cargarSubMenu(String... opciones) {
		int opcion = 0;
		
		for(int i=0;i<opciones.length;i++) {
			System.out.println((i+1)+"-"+opciones[i]);
		}
		System.out.println((opciones.length+1)+"-"+"Volver al menu principal");
		
		while(opcion<1 || opcion>opciones.length+1) {
			System.out.println("\nIntroduzca una opcion: ");
			opcion = scanner.nextInt();
		}		
		return opcion;
	}
}
