package org.generation.italy.geometria;

public class Rettangolo {

	//inserisco gli attributi
	int base;
	int altezza;
	
	//elementi del costruttore
	Rettangolo(int base,int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	//inserisco i due metodi per calcolare il perimetro e l'area del rettangolo
	int calcoloPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
	
	int calcoloArea() {
		int area = base * altezza;
		return area;
	}
	
	
}
