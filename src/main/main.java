package main;

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
	}

}
