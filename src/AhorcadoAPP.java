import java.util.*;
public class AhorcadoAPP {

	public static void main(String[] args) {
		Palabras p = new Palabras();
		Scanner sc = new Scanner(System.in);
		EstadoYpalabra inicio = new EstadoYpalabra();
			
			String palabra = p.setPalabras(sc);
			//INTRODUCIMOS LA PALABRA
			
			int longitud = p.setLongitud(palabra);
			// determinamos la longitud de la palabra
			
			inicio.setArray(longitud);
			// Array estado
			
			inicio.Estado();
			//inicia el juego
			
			inicio.tamañoPalabra();
			//Muestra espacios de las letras o letras acertadas
			
			p.setLetra(sc);
			//Introducimos una letra
	}
	
	    
}
