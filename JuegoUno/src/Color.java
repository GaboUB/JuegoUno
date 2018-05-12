
public enum Color {
	rojo,amarillo,azul,verde,negro; 
	
	
	public static Color[] obtenerColoresRegulares(){
		return new Color[]{rojo,amarillo,azul,verde};
	}
	
	
	public static Color[] obtenerColoresEspeciales(){
		return new Color[]{negro};
	}
}	