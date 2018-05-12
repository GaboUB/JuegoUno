

public enum Tipo {
	cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,tomaDos,salta,reversa,cambiaColor,toma4,dorso;

	
	public static Tipo[] obtenerTiposRegulares(){
		return new Tipo[]{cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,tomaDos,salta,reversa};
	}
	
	
	public static Tipo[] obtenerTiposEspeciales(){
		return new Tipo[]{cambiaColor,toma4};
	}
	
}