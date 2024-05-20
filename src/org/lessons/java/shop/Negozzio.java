package org.lessons.java.shop;

import java.util.Scanner;

public class Negozzio {

	public static void main(String[] args) {
		
		//	importo il metodoscanner 
		Scanner input = new Scanner(System.in);
		System.out.println("Qual'è prodotto ti serve? \n");
		
//	istanzio il prodotto da valorizare col input del utente
		Prodotto prodotto1 = new Prodotto(0, null, null, 0, 0, 0);
				
//	valoriso gli argomenti del costrutore con gli input  	
		System.out.println("Inserisci il Nome del prodotto ");
		prodotto1.nome = input.nextLine();
		System.out.println("Inserisci una descrizione del prodotto ");
		prodotto1.descrizione = input.nextLine();
		System.out.println("Inserisci il prezzo del prodotto ");
		prodotto1.prezzo  = input.nextDouble();
		
//	stampo il prodotto con	con tutti i dati valorizati
		System.out.println(prodotto1);
		
//		Prodotto prodotto2 = new Prodotto(0, null, null, 0, 0, 0);
		
//		System.out.println("Inserisci il Nome del prodotto ");
//		prodotto2.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		prodotto2.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		prodotto2.prezzo  = input.nextDouble();
//		System.out.println(prodotto2);
		
	}

}
