import java.util.*;
public class Partidas {

	int cantidad = 0;
	int j1 = 0;
	int j2 = 0;
	boolean j1active = false;
	boolean j2active = false;
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getJ1() {
		return j1;
	}

	public void setJ1(int j1) {
		this.j1 = j1;
	}

	public int getJ2() {
		return j2;
	}

	public void setJ2(int j2) {
		this.j2 = j2;
	}

	public void setPartidas(Scanner sc){
		System.out.println("¿Cuantas partidas quieres hechar?");
		this.cantidad = sc.nextInt();
	}
	public void setJugador(){
		int i= (int) (Math.random()*100+1);
		
		if(i%2==0){
			
			this.j1active = true;
		}
		else{
			
			this.j2active = true;
		}

	}
	
	
	public void Ocultar(){
		for(int i=0; i<2000; i++){
			System.out.println("");
			
			}
		}

	public void asignarPuntos(int vidas,int aciertos) {
		if(vidas == 0){
			if(this.j1active == true){
				j1++;
			}else j2++;
		}else{
			if(this.j1active == true){
				j2++;
			}else{
				j1++;
			}
		}
		if(this.j1active == true){
			this.j1active=false;
			this.j2active=true;
		}else{
			this.j1active=true;
			this.j2active=false;
		}
	
	}
	
	public void getJugador(){
		if(j1active == true){
			System.out.println("Le toca al jugador 1");
		}else{
			System.out.println("Le toca al jugador 2");
		}
	}
	
	public void getPuntos(){
		System.out.println("Jugador 1: "+j1);
		System.out.println("jugador 2: "+j2);
	}
	}
	

