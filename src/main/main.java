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
	}

}
