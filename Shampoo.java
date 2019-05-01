package ejerciciosPNT;

public class Shampoo extends Productos {
	private int contenido;
	public Shampoo(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido=contenido;
	}
	@Override
	public String toString(){
		String prod="Nombre: "+nombre+" ///"+" Contenido: "+contenido+" ml"+" ///"+" Precio: "+"$"+precio;
		return prod;
	}
	@Override
	public void detalles() {
		System.out.println(this.toString());
		
	}
	

}
