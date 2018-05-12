

public class Cartas {

	private Color color;
	private Tipo tipo;
	public static String[] TIPO= {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","tomaDos","salta","reversa","cambiaColor","toma4"	};
		
	
	public Cartas(Color color,Tipo tipo)
	{
		this.color=color;
		this.tipo=tipo;
	
	}
		
	public Tipo getTipo(){
		return this.tipo;
	}
	
	public void setTipo(Tipo tipo){
		this.tipo=tipo;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void setColor(Color color){
		this.color=color;
	}
	
	
	@Override
	public boolean equals(Object carta){
		Cartas otra=null;
		try{
			otra=(Cartas)carta;
		}
		catch(ClassCastException e){
			return false;
		}
		
		if(this.tipo==Tipo.cambiaColor&&otra.tipo==Tipo.cambiaColor)
			return true;
		if(this.tipo==Tipo.toma4&&otra.tipo==Tipo.toma4)
			return true;
		if(this.color==otra.color&&this.tipo==otra.tipo)
			return true;
		else
			return false;
	}	
}

