package main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {

	static Scanner in;

	public static void printMenu() {

		System.out.println("Buongiono, benvenuti in Rubrica");
        System.out.println();
        System.out.println("1) aggiungi");
        System.out.println("2) ricerca");
        System.out.println("3) mostra preferiti");
        System.out.println("4) modifica");
        System.out.println("5) elimina");
        System.out.println("6) visualizza rubrica");
        System.out.println("7) esci");      
        System.out.println();
        System.out.print("Inserisci una scelta [1-7]: ");


	}

	public void printMetodo() {
		in = new Scanner(System.in);
				// int che serve per prendere la scelta dell'utente
		boolean y = true;
		ArrayList<Contatto> Contatti = new ArrayList<Contatto>();
		Contatto contact = new Contatto();
		contact.populateArrayFromFile(Contatti);
		while(y== true) {
		  printMenu(); // metodo che richiama i print del menu
		  try {
		    int a = Integer.parseInt(in.nextLine());  // la scelta dell'utente diventa un int
     		switch(a) {
			case 1 :
					Contatti.add(contact.addContact());
				break;
			case 2 :
					System.out.println("Inserisci il nome da ricercare: ");
			    	String nomeDaSearchare = in.nextLine();
			    	System.out.println("Inserisci il cognome da ricercare: ");
			    	String cognomeDaSearchare = in.nextLine();
					contact.ricercaPerNome(Contatti, nomeDaSearchare, cognomeDaSearchare);
				break;
			case 3 :
					contact.mostraPreferiti(Contatti);
				break;
			case 4 :
					contact.modificaContatto(Contatti);
				break;
			case 5 :
					contact.eliminaContatto(Contatti);
				break;
			case 6 :
					contact.mostraRubrica(Contatti);
				break;
			case 7 :
				System.out.println("Grazie e Arrivederci");	
				contact.printContatti(Contatti);
				y = false; // esce dal ciclo
				break;				
			default :
				System.out.println("Scelta non valida, riprova");
				break;
		}

	    } catch(NumberFormatException e) {							// catch che si attiva quando usa una stringa al posto din un int
            System.out.println( "Errore di digitalizzazione" );
		}
	 }

		in.close();
   }






}
