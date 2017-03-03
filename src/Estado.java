
public class Estado {

	int vidas = 6;
	int aciertos = 0;
	Dibujos dibujos = new Dibujos ();
	
	
	public void mostrarestado(){
		
		dibujos.dibujar(vidas);
		System.out.println("Te quedan:"+vidas);
		
		
	}
	
	public void  restavidas (){
		
		vidas--;
			
	}
	
	
	public void aciertos (){
		
		aciertos++;
		
	}
	
	public void reset(){
		this.vidas =6;
		this.aciertos = 0;
	}
	
}
