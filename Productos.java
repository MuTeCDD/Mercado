package ejerciciosPNT;


public abstract class Productos implements Comparable<Productos>{
	protected String nombre;
	protected int precio;
	public Productos(String nombre, int precio){
		this.nombre=nombre;
		this.precio=precio;
	}
	//Devuelve el nombre que se va a mostrar cuando muestra el mas caro y barato
	public String getNombre(){
		return nombre;
	}
	//Metodo que tiene que ser reemplazado para cargar todos los objetos 
	public abstract void detalles();
	//Compara los productos
	public int compareTo(Productos o) {
		
	    return this.precio > o.precio ? 1 : this.precio < o.precio ? -1 : 0;
	}
	
}
