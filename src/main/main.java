package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		//creare una String messaggio valorizzata con “oggi è proprio”, e un int giornoDellaSettimana con un valore da 1 a 7 
		
		String messaggio= "oggi è proprio";
		int giornoDellaSettimana = 4;
		
		//usare l’operatore ternario per concatenare al messaggio “un” o “una” in base al giorno della settimana 
		String x = giornoDellaSettimana != 7 ? "un" : "una";
		//usare if else if per concatenare il giorno della settimana, corrispondente al numero, al messaggio
		if(giornoDellaSettimana == 1) {
			System.out.println(messaggio + " " + x + " lunedì");
		} else if(giornoDellaSettimana == 2) {
			System.out.println(messaggio + " " + x + " martedì");
		} else if(giornoDellaSettimana == 3) {
			System.out.println(messaggio + " " + x + " mercoledì");
		} else if(giornoDellaSettimana == 4) {
			System.out.println(messaggio + " " + x + " giovedì");
		} else if(giornoDellaSettimana == 5) {
			System.out.println(messaggio + " " + x + " venerdì");
		} else if(giornoDellaSettimana == 6) {
			System.out.println(messaggio + " " + x + " sabato");
		} else {
			System.out.println(messaggio + " " + x + " domenica");
		}
		
		
		// creare 3 boolean “staPiovendo”, “hoOmbrello”, “hoLaMacchina” 
		Boolean staPiovendo;
		Boolean hoOmbrello;
		Boolean hoLaMacchina;
		
		//il programma deve stampare “posso uscire” solo se 
				//.non sta piovendo 
				//.sta piovendo e ha l’ombrello o la macchina
		Scanner scan = new Scanner(System.in);
		System.out.println("sta piovendo? rispondi con true o false");
		staPiovendo = scan.nextBoolean();
		System.out.println("ho l'ombrello? rispondi con true o false");
		hoOmbrello = scan.nextBoolean();
		System.out.println("ho la macchina? rispondi con true o false");
		hoLaMacchina = scan.nextBoolean();
		
		if(!staPiovendo) {
			System.out.println("posso uscire");
		} else if(staPiovendo && (hoOmbrello  || hoLaMacchina)) {
			System.out.println("posso uscire");
		} else {
			System.out.println("non posso uscire");
		}
		scan.close();
		
		//Scrivere un programma che: 
		//Dato un int stampi se è positivo o negativo 
		int n1 = 4;
		if(n1 > 0) {
			System.out.println("Il numero è positivo");
		} else {
			System.out.println("Il numero è negativo");
		}
		//Dato un int stampi se è pari o dispari 
		int n2 = 7;
		if(n2 % 2 == 0) {
			System.out.println("Il numero è pari");
		} else {
			System.out.println("Il numero è dispari");
		}
		//Dato un int stampi se è compreso tra 20 e 10 oppure no 
		int n3 = 8;
		if(n3 > 10 && n3 < 20) {
			System.out.println("il numero è compreso tra 10 e 20");
		} else {
			System.out.println("il numero non è compreso tra 10 e 20");
		}
		//Dato un int “eta” stampi “sei maggiorenne” o “sei minorenne” 
		int eta = 18;
		if(eta <18) {
			System.out.println("sei minorenne");
		} else {
			System.out.println("sei maggiorenne");
		}
		//Dato un int “eta” e una boolean “isPatentato” se è maggiorenne e patentato stampi “puoi guidare”, se è solo maggiorenne stampi “devi prendere la patente!” altrimenti  stampi “non puoi guidare” 
		int anni = 30;
		Boolean isPatentato = true;
		if(anni > 18 && isPatentato == true) {
			System.out.println("puoi guidare");
		}else if(anni > 18) {
			System.out.println("devi prendere la patente");
		} else {
			System.out.println("non puoi guidare");
		}
		//Dato un int stampi se è un multiplo di 3 e un multiplo di 5 
		int n4 = 90;
		if(n4 % 3 == 0 && n4 % 5 == 0) {
			System.out.println("il numero è multiplo di 3 e di 5");
		}
		//Dato un int verifichi se è un multiplo di 10 o un multiplo di 3 
		int n5 = 30;
		if(n5 % 10 == 0 && n5 % 3 == 0) {
			System.out.println("il numero è multiplo di 10 e di 3");
		}
		//Dato un int verifichi se è divisibile per 10 
		int n6 = 4;
		if(n6 / 10 == 0) {
			System.out.println("Il numero è divisibile per 10");
		}
		//Dati quattro double, da 1.0 a 10.0, “matematica”, “storia”, “geografia”, “arte” e un boolean “isCreditiSufficienti”, calcoli la media in double e stampi in console se lo studente è promosso. Lo studente è promosso se ha una media sufficiente o se è di 1 punto sotto la sufficienza ma isCreditiSufficienti è true
		double matematica = 5.5;
		double storia = 7.0;
		double geografia = 8.5;
		double arte = 9.0;
		Boolean isCreditiSufficienti = true;
		double media = (matematica + storia + geografia + arte) / 4.0;
		
		if (media >= 6.0 || (media >= 5.0 && isCreditiSufficienti)) {
            System.out.println("Lo studente è PROMOSSO!");
        } else {
            System.out.println("Lo studente è BOCCIATO!");
        }
	}

}
