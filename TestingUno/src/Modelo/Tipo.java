package Modelo;

public enum Tipo {
	cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,masDos,sinTurno,reversa,cambiaColor,mas4,dorso;

	//Devuelve los tipos regulares de cartas (con colores)
	public static Tipo[] obtenerTiposRegulares(){
		return new Tipo[]{cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,masDos,sinTurno,reversa};
	}
	
	//Devuelve los tipos especiales de cartas (negras)
	public static Tipo[] obtenerTiposEspeciales(){
		return new Tipo[]{cambiaColor,mas4};
	}

}
			