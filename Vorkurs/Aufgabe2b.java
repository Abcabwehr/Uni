import java.util.Scanner;

public class Aufgabe2b {
	public static void main(String[] args) {
	
	boolean Antwort = false;	
	int zahl1, zahl2, frage, ergebnis, produkt, devision, subtraktion;
	Scanner SC = new Scanner(System.in);
	System.out.println(" Erste Zahl der Rechnung ");
	zahl1 = SC.nextInt();
	System.out.println(" Zweite Zahl der Rechnung ");
	zahl2 = SC.nextInt();
	System.out.println("Was ist das Ergebnis von " + zahl1 + " | + | - | * | / | " + zahl2 + " ?");
	frage = SC.nextInt();
	ergebnis = zahl1 + zahl2 ;
	produkt = zahl1 * zahl2 ;
	devision = zahl1 / zahl2;
	subtraktion = zahl1 - zahl2;
	if (ergebnis == frage ) { Antwort = true; System.out.println(" Die Antwort ist korrekt");
	} else if ( produkt == frage ) { Antwort = true; System.out.println(" Die Antwort ist korrekt");
	} else if ( devision == frage ) { Antwort = true; System.out.println(" Die Antwort ist korrekt");
	} else if ( subtraktion == frage ) { Antwort = true; System.out.println(" Die Antwort ist korrekt");
	
	
	
	
	
	
	} else {System.out.println(" Die Antwort ist falsch !");
		
	}
	
		
		
		
	}

}
