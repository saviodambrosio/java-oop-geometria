package org.generation.italy.geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	//chiedo all'utente di inserire dimensioni di base e altezza del rettangolo
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserire valore base: ");
	int base = scan.nextInt();
	System.out.println("Inserire valore altezza: ");
	int altezza = scan.nextInt();
		
	Rettangolo rettangolo = new Rettangolo(base,altezza);
	
	System.out.println("Perimetro: " + rettangolo.calcoloPerimetro());
	System.out.println("Area: " + rettangolo.calcoloArea());
			
	scan.close();
	}

}
