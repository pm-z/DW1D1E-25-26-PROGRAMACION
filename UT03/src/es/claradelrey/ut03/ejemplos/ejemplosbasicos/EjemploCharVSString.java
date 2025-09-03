package es.claradelrey.ut03.ejemplos.ejemplosbasicos;

public class EjemploCharVSString {

	/* La inicialización de un char tiene que hacerse con comillas simples
	 * quedando las comillas dobles reservadas para asignar valores a String
	 */
	public static void main(String[] args) {
		char caracter;
		String cadena;
		
		// CORRECTO
		caracter = 'c';
		cadena = "Esto es una cadena";
		
		// INCORECTO!!!!! Si se descomentan las siguientes líneas aparecerán errores de compilación
		//caracter = "Caracter";
		//cadena = 'incoreccto';
		
		// Mostramos el contenido de las variables:
		System.out.println("El contenido de caracter es: " + caracter);
		System.out.println("El contenido de cadena es: " + cadena);
	}

}
