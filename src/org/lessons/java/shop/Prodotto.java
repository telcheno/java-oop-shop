//Nel progetto java-oop-shop, package org.lessons.java.shop, 
//creare la classe Prodotto che gestisce i prodotti dello shop.
//Un prodotto è caratterizzato da:
//- codice (numero intero)
//- nome 
//- descrizione 
//- prezzo 
//- iva
//Usate opportunamente i livelli di accesso (public, private),
//i costruttori, 
//i metodi getter e setter ed 
//eventuali altri metodi di “utilità” per fare in modo che: 
//- alla creazione di un nuovo prodotto il codice sia valorizzato 
//con un numero random 
//- il codice prodotto sia accessibile solo in lettura 
//- gli altri attributi siano accessibili sia in lettura che in scrittura 
//- il prodotto esponga un metodn  o per avere il prezzo base 
//- il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
//- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome 
//Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
//BONUS: create un metodo (statico) 
//che restituisca il codice con un pad left di 0 
//per arrivare a 8 caratteri 
//(ad esempio codice 91 diventa 00000091, 
//mentre codice 123445567 resta come è)


package org.lessons.java.shop;

//importo il metodo random per generare il numero per il codice
import java.util.Random;

//creo la classe prodotto
public class Prodotto {
	
//	istanzio le caratteristiche del prodotto
	private int codice;
	protected String nome;
	protected String descrizione; 
	protected double prezzo; 
	private double iva;
	private double prezzoIva;
	
//creo il costruttore del prodotto con i parametri
	public  Prodotto(int codice, String nome, String descrizione, double prezzo, float iva, float prezzoIva) {
		//stanzio le variabili del prodotto
		
		this.codice = getCodice();//	asegno il metodo che genera codice random
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = getIva(); // asegno il metodo che calcola l'iva
		this.prezzoIva = getPrezzoIva();// asegno il metodo che calcola il prozzo col'iva
	}
	
//========================================//
//metodi getters - setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

//	creo nel metodo getIva  il calcolo del iva che è solo in lettura
	public double getIva() {
		iva = prezzo * 22 / 100;
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

//	creo nel metodo getPrezzoIva  il calcolo del prezzo col iva che è solo in lettura
	public double getPrezzoIva() {
		prezzoIva = prezzo + iva;
		return prezzoIva;
	}

	public void setPrezzoIva(double prezzoIva) {
		this.prezzoIva = prezzoIva;
	}

	
	//	istanzio il metodo Random
	Random rand = new Random();

//	creo il metodo che genera il numero random che sara asegnato al codice del prodotto
	public int getCodice() {
		codice = rand.nextInt(100000000);
		return codice;
	}

	
//	spongo il riepilogo delprodotto col metodo toString
	public String toString() {
		String riepilogoProdotto = ("I dati del prodotto: \n" 
				+ "codice: "  + this.codice + "\n" 
				+ "Nome prodotto: " + this.nome + "\n" 
				+ "Descrizione prodotto: " +  this.descrizione + "\n" 
				+ "Prezzo base: " + this.prezzo + "\n" 
				+ "iva 22%: " + this.getIva() + "\n" 
				+ "Prezzo col'Iva: " + this.getPrezzoIva() + ". \n" 
				+ "PRODOTTO: " + this.codice + " - "  + this.nome + " - " + this.descrizione + " - €" + this.getPrezzoIva() + ". \n");
		return riepilogoProdotto;
	}
}
