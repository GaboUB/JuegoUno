package Modelo;

public class Carta {
	private Color color;
	private Tipo tipo;
	
public Carta(Color color,Tipo tipo){
	this.setColor(color);
	this.setTipo(tipo);
}

public Tipo getTipo() {
	return this.tipo;
}

public void setTipo(Tipo tipo) {
	this.tipo = tipo;
}

public Color getColor() {
	return this.color;
}

public void setColor(Color color) {
	this.color = color;
}

//Metodo toString de las cartas
public String toString(){
	return this.tipo+" "+this.color;
}

public boolean equals(Object carta){
	Carta otra=null;
	try{
		otra=(Carta)carta;
	}
	catch(ClassCastException e){
		return false;
	}
	/*2 casos especiales cuando no nos importa el color...*/
	if(this.tipo==Tipo.cambiaColor&&otra.tipo==Tipo.cambiaColor)
		return true;
	if(this.tipo==Tipo.mas4&&otra.tipo==Tipo.mas4)
		return true;
	if(this.color==otra.color&&this.tipo==otra.tipo)
		return true;
	else
		return false;
}
	
		
}	