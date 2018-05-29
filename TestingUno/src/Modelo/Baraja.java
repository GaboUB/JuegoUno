package Modelo;

import java.util.Random;
import java.util.Vector;

public class Baraja {
private Vector <Carta> pilaParaTomar;//Vector de cartas que contiene las cartas para tomar
	
	/*Constructor que crea e inicializa una baraja (ordenada) de UNO*/
	public Baraja(){
		pilaParaTomar=new Vector <Carta>();//Inicializamos el vector de cartas
		//Colocamos las cartas de los colores 
		for( Color color: Color.obtenerColoresRegulares()){
			for (Tipo tipo: Tipo.obtenerTiposRegulares()){
				pilaParaTomar.add(new Carta(color,tipo));
				//Hay dos cartas de cada tipo que no es cero
				if (tipo!=Tipo.cero)
					pilaParaTomar.add(new Carta(color,tipo));
			}
		}
		//Colocamos las cartas de los colores especiales
		for( Color color: Color.obtenerColoresEspeciales()){
			for (Tipo tipo: Tipo.obtenerTiposEspeciales())
					for(int i=0;i<4;i++)
					pilaParaTomar.add(new Carta(color,tipo));
		}	
	}
	
	//Metodo que se encarga de revolver la baraja
	public void barajar(){
		Vector <Carta> temporal=new Vector<Carta>();
		Random generador=new Random();//Generador de numeros aleatorios
		int limite=pilaParaTomar.size();
		for(int i=0;i<limite;i++)
			temporal.add(pilaParaTomar.remove(generador.nextInt(pilaParaTomar.size())));
		pilaParaTomar=temporal;
	}
	
	//Metodo utilizado para tomar una carta
	public Carta robarCarta(){
		return pilaParaTomar.remove(0);
	}
	
	/*Metodo que descarta una carta, la devuelve a la parte de abajo del mazo*/
	public void descartarCarta(Carta carta){
		pilaParaTomar.add(carta);
	}
	
	public static void main(String args[]){
		Baraja b=new Baraja();
		System.out.println(b.pilaParaTomar.size());
		b.barajar();
		for (Carta c: b.pilaParaTomar)
			System.out.println(c.getColor()+" "+c.getTipo());
		System.out.println(b.pilaParaTomar.size());
	}	

}
