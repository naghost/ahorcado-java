import java.util.*;
public class Palabra {

	String setPalabra;
	String palabra[][];
	Scanner sc = new Scanner(System.in);
	Errores error = new Errores();
	
	public void setPalabra(){
		boolean error =false;
		do{
		System.out.println("Introduce la palabra:");
		setPalabra = sc.nextLine();
		error = this.error.vacio(setPalabra);
			}while(error == true);
		palabra = new String[setPalabra.length()][2];
		
			for(int i =0; i<setPalabra.length();i++){
				char letra =setPalabra.charAt(i);
				
				palabra[i][0]= "_";
				palabra[i][1]= Character.toString(letra);
			
			}
			
	}
	public void getPalabra() { System.out.println(" ");
		 for(int i =0;i<palabra.length;i++){
			
			System.out.print( " "+palabra[i][0]+" " );
		 }
		 System.out.println("\n ");
	}
	public String setLetra(){
		String letra;
		boolean error = false;
		do{
			System.out.println("Introduce una letra: ");
			letra = sc.nextLine();
			error = this.error.letra(letra);
				}while(error == true);
		return letra;
		
		
	}
	
	public boolean comprobar(String letra){
		boolean error = false;
		
		for(int i = 0 ; i < palabra.length;i++){
		
			if(palabra[i][1].equals(letra)){
				palabra[i][0] = palabra[i][1];
				error = true;
			}
		}
		
		return error;
	}
	
	
}
