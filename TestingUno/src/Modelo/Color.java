package Modelo;

public enum Color {
rojo,amarillo,azul,verde,negro; //Colores de las cartas
	
	//Devuelve los colores "regulares" de las cartas
	public static Color[] obtenerColoresRegulares(){
		return new Color[]{rojo,amarillo,azul,verde};
	}
	
	//Devuelve los colores "especiales" (Negro)
	public static Color[] obtenerColoresEspeciales(){
		return new Color[]{negro};
	}
}


		