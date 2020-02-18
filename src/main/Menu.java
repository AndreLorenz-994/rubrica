package main;
import java.util.Scanner;

public class Menu {

	static Scanner in;
	
	public static void printMenu() {
		
		System.out.println("Buongiono, benvenuti in Rubrica");
        System.out.println();
        System.out.println("1) inserisci dati");
        System.out.println("2) ricerca");
        System.out.println("3) aggiunggi");
        System.out.println("4) modifica");
        System.out.println("5) elimina");
        System.out.println("6) visualizza rubrica");
        System.out.println("7) esci");
        System.out.println();
        System.out.print("Inserisci una scelta [1-7]: ");
		
		
	}
	
	public void printMetodo() {
		in = new Scanner(System.in); 
		int a = 0;			// int che serve per prendere la scelta dell'utente
		boolean x = true;
		while(x== true) {
		  printMenu(); // metodo che richiama i print del menu
		  try {
		    a = Integer.parseInt(in.nextLine());  // la scelta dell'utente diventa un int
     		switch(a) {
			case 1 :
				
				break;
			case 2 :
		
				break;
			case 3 :
			
				break;
			case 4 :
			
				break;
			case 5 :
				
				break;
			case 6 :
				
				break;
			case 7 :
				System.out.println("Grazie e Arrivederci");
				x = false; // esce dal ciclo
				break;
			default :
				System.out.println("Scelta non valida, riprova");
		}
		    	
	    } catch(NumberFormatException e) {							// catch che si attiva quando usa una stringa al posto din un int
            System.out.println( "Errore di digitalizzazione" );
		}
	 }   
   }
	
	
	
	
}
