package boletinstrings;

import java.util.Scanner;

public class E9 {
	public static void main(String[] args) {
		/*
		 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
		 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
		 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
		 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
		 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
		 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
		 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
		 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
		 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
		 */
		
		//Variable para la frase introducida
		String frase;
		
		//Variable para la frase traducida
		String translated;
		
		//Variables para saber si es javalin o javalen
		boolean javalinlen = false;
		
		//Abrimos scanner
		Scanner rd = new Scanner(System.in);
		
		//Pedimos al usuario la frase
		System.out.println("Introduce la frase:");
		frase = rd.nextLine();
		
		//Comprobamos si es de Javalandia
		if (frase.startsWith("Javalín, javalón")) {		
			//Informamos de que es un dialecto
			System.out.println("Es el dialecto javalén");
			
			//Ponemos javalínlen a positivo para indicar que el dialecto es Javalín, Javalón
			javalinlen = true;
	
			//Llamamos al método de traducir e imprimimos la frase sin el dialecto
			translated = translate(frase, javalinlen);
			System.out.println(translated);
			
		} else if (frase.endsWith("javalén, len, len")){
			//Informamos de que es un dialecto
			System.out.println("Es el dialecto javalén");
			
			//Llamamos al método de traducir e imprimimos la frase sin el dialecto
			translated = translate(frase, javalinlen);
			System.out.println(translated);
		}else if (frase.startsWith("Javalín, javalón") && frase.endsWith("javalén, len, len")) {
			System.out.println("No se comprenden 2 dialectos a la vez");
		} else {
			System.out.println("La frase no es de un dialecto de Javalandia");
		}
		
		//Cerramos scanner
		rd.close();
		
	}
	
	//Método para traducir
	static String translate(String frase, boolean javalinlen) {
		//Variable para la frase traducida
		String traducción;
		
		if (javalinlen) {
			//Substraemos javalin javalon
			traducción = frase.substring(17, frase.length());
			
			//Quitamos los espacios al inicio y al final
			traducción = traducción.trim();
		} else {
			//Substraemos javalen len len 
			traducción = frase.substring(0, frase.length()-17);	
			
			//Quitamos los espacios al inicio y al final
			traducción = traducción.trim();
		}
	
		//Devolvemos la traducción
		return traducción;
	}
}
