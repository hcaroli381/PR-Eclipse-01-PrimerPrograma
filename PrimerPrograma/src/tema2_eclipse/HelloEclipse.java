package tema2_eclipse;

public class HelloEclipse {
	/* 
	   Autor: Hugo Carrasco
	   Fecha: 29/03/2006
	*/
	public static void main(String[] args) {
		//System.out.println proyecta lo que pongamos entre comillas en consola
		System.out.println("¡Mi primer programa!");  
		System.out.println("Mi nombre es Hugo Carrasco");
		System.out.println("Estoy aprendiendo a usar java");
		System.out.println("Eclipse es un IDE muy útil");
		
		//click derecho, refactor y rename cambia la variable en todas partes
		int contadorDeMensajes = 1;
		contadorDeMensajes++;
		System.out.println("Mensajes impresos: " + contadorDeMensajes);
		
		//control + shift coloca correctamente las lineas no tabuladas de forma óptima
		int x = 3;
		System.out.print("Este código ahora está");
		System.out.print(" muy bien ");
		System.out.print("tabulado");
		x = 7;
		System.out.println(x);
		
	}

}
