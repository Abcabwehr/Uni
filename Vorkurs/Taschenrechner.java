import java.util.Scanner;

public class Taschenrechner {
	public static void main(String[] args ) {
		
		double zahl1, zahl2, ergebnis;
		Scanner scannerVariable = new Scanner(System.in);
		System.out.println(" Erste Zahl bitte ");
	 	zahl1 = scannerVariable.nextDouble();
	 	System.out.println(" Zweite Zahl bitte ");
	 	zahl2 = scannerVariable.nextDouble();
	 	ergebnis=zahl1+zahl2;
	 	System.out.println(" Das ergebnis der Addition lautet " + ergebnis);
	 	ergebnis=zahl1-zahl2;
	 	System.out.println(" Das ergebnis der Subtraktion lautet " + ergebnis);
	 	ergebnis=zahl1*zahl2;
	 	System.out.println(" Das ergebnis der Mutliplikation lautet " + ergebnis);
	 	ergebnis=zahl1/zahl2;
	 	System.out.println(" Das ergebnis der Division lautet " + ergebnis);
	 	ergebnis=zahl1%zahl2;
	 	System.out.println(" Das ergebnis der Modulo lautet " + ergebnis);
	     }	
	}