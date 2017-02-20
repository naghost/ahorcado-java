
public class EstadoYpalabra {
	Dibujos estado = new Dibujos();
	Integer vidas = new Integer(6);
	String letras[] ;
	
	
		public void Estado(){
			System.out.println("\nTienes "+vidas+" vidas");
			this.estado.dibujar(this.vidas);
		}
		
		
		public void tamañoPalabra(){
			System.out.print("\n\n Palabra: ");
			for(int i=0; i<letras.length;i++){
				System.out.print(letras[i]+" ");
			}
		}
		

		public void setArray(int longitud) {
			letras = new String[longitud];
			for(int i = 0 ; i<letras.length;i++){
				letras[i]="_";
			}
			
			
		}
}
