import java.util.Scanner;

public class Quiz {
   public static void main(String[] args) {
		
		boolean Antwort = false;	
		int zahl1, zahl2, frage1, frage2, frage3, frage4, ergebnis, produkt, division, subtraktion;
		Scanner SC = new Scanner(System.in);
		System.out.println(" Erste Zahl der Rechnung ");
		zahl1 = SC.nextInt();
		System.out.println(" Zweite Zahl der Rechnung ");
		zahl2 = SC.nextInt();
		System.out.println("Was ist das Ergebnis von " + zahl1 + " + " + zahl2 + " ? ");
		frage1 = SC.nextInt();
		ergebnis = zahl1 + zahl2 ;
		produkt = zahl1 * zahl2 ;
		division = zahl1 / zahl2;
		subtraktion = zahl1 - zahl2;
		System.out.println("Was ist das Ergebnis von " + zahl1 + " - " + zahl2 + " ? ");
		frage2 = SC.nextInt();
		System.out.println("Was ist das Ergebnis von " + zahl1 + " * " + zahl2 + " ? ");
		frage3 = SC.nextInt();
		System.out.println("Was ist das Ergebnis von " + zahl1 + " / " + zahl2 + " ? ");
		frage4 = SC.nextInt();
		if (ergebnis == frage1 ) { Antwort = true; System.out.println(" Die Antwort der Addition ist korrekt");
		} else {System.out.println(" Die Antwort der Addition ist falsch !");
		} if ( subtraktion == frage2 ) { Antwort = true; System.out.println(" Die Antwort der Subtraktion ist korrekt");
		} else {System.out.println(" Die Antwort der Subtraktion ist falsch !");
		} if ( produkt == frage3 ) { Antwort = true; System.out.println(" Die Antwort der Multiplikation ist korrekt");
		} else {System.out.println(" Die Antwort der Multiplikation ist falsch !");
		} if ( division == frage4 ) { Antwort = true; System.out.println(" Die Antwort der Division ist korrekt");
		} else {System.out.println(" Die Antwort der Division ist falsch !");
			
		}
		
			
			
			
		}

	}
