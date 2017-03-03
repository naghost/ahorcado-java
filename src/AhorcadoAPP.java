import java.util.*;
public class AhorcadoAPP {

	public static void main(String[] args) {
		//variables
		int contador = 0;
		String pasarela;
		String letra;
		boolean acierto;
			Partidas setup = new Partidas();
			Scanner sc = new Scanner(System.in);
			Palabra palabra = new Palabra();
			Estado datos = new Estado();
			
		
		//fin variables
			
	
		setup.setPartidas(sc);
		// Se asignan la cantidad de partidas que se van  a jugar
	
		setup.setJugador();
		//Se decide quien empieza
		setup.getJugador();
		//Mostramos a quien le toca
			do{
				palabra.setPalabra();
				//Se pide la palabra
		
				setup.Ocultar();
				//oculta mediante el espaciado la palabra escrita
		
				do{
					datos.mostrarestado();
					//muestra las vidas que quedan
		
					palabra.getPalabra();
					//Mostramos la palabra
			
					letra = palabra.setLetra();
					//Introducimos una letra
			
					acierto = palabra.comprobar(letra);
					//comprobamos letra
			
						if(acierto == true){
							datos.aciertos();
						}else{
							datos.restavidas();
						}
					//asignamos el resultado
				}while(datos.vidas != 0 && datos.aciertos < palabra.palabra.length);
				
					datos.mostrarestado();
					//muestra las vidas que quedan
	
					palabra.getPalabra();
					//Mostramos la palabra
		
					if(datos.aciertos==palabra.palabra.length){
						if(setup.j1active){
							System.out.println("GANA JUGADOR 2");
						}else System.out.println("GANA JUGADOR 1");
					}
					//Mostramos si alguien a ganado por aciertos
					
					setup.asignarPuntos(datos.vidas, datos.aciertos);
					//asignamos un punto al jugador
			
					datos.reset();
					//Resetamos aciertos y vidas
				
					setup.getPuntos();
					//Muestra marcador
			
		
						contador++;
						//Siguiente ronda
			}while(contador < setup.cantidad);
		
			
	}
	
	    
}
