package ejerciciosPNT;


public abstract class Productos implements Comparable<Productos>{
	String nombre;
	int precio;
	public Productos(String nombre, int precio){
		this.nombre=nombre;
		this.precio=precio;
	}
	//DEVUELVE EL NOMBRE QUE SE VA A MOSTRAR CUANDO MUESTRA EL MAS CARO Y BARATO
	public String getNombre(){
		return nombre;
	}
	//Metodo que tiene que ser reemplazado para cargar todos los objetos 
	public abstract void detalles();
	//COMPARA LOS PRODUCTOS
	public int compareTo(Productos o) {
		
	    return this.precio > o.precio ?
	        1 : this.precio < o.precio ? -1 : 0;
	}
	
}
