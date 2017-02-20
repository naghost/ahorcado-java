import java.util.Scanner;

public class Palabras {
	Errores comprobar = new Errores();
	
	public String setPalabras(Scanner sc){
		
		boolean error = false;
		String palabra;
		do{
			System.out.println("Introduce la palabra: ");
			palabra = sc.nextLine();
			error = comprobar.vacio(palabra);
			}while(error == true);
		palabra = palabra.trim();
		for(int i = 0; i < 1000; i++){
			System.out.println(" ");
		}
		return palabra;
		}
	
	public int setLongitud(String palabra){
		int longitud = palabra.length();
		return longitud;
		
	}
	
	public char setLetra(Scanner sc){
		
		boolean error = false;
		String letras;
		do{
		System.out.println("\n\n Introduce una letra: ");
			letras = sc.nextLine();
		
		error = comprobar.letra(letras);
			}while(error == true);
		
		char letra = letras.charAt(0);
		System.out.println(letra);
		return letra;
		
	}
}
