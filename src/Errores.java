
public class Errores {
boolean comprobar = false;
	
public boolean vacio(String palabra){
		comprobar = false;
		
		    palabra = palabra.trim(); 
		    if (palabra.isEmpty()) { 
		        comprobar = true;
		    } 
		    else {
              int  pos = palabra.indexOf(" "); 
                if (pos != -1) { 
                          comprobar = true;
                          
                }
		
		
	}return comprobar;
		    }
	
	public boolean letra(String letra){
		comprobar = false;
		
		if(letra.length()!= 1){
			comprobar = true;
		}
			
		return comprobar;
	}
}
