package ejerciciosPNT;

public class CocaCola extends Productos {
	double litros;
	public CocaCola(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros=litros;
	}
	@Override
	public String toString(){
		String prod="Nombre: "+nombre+" ///"+" Litros: "+litros+" ///"+" Precio: "+"$"+precio;
		return prod;
	}
	@Override
	public void detalles() {
		System.out.println(this.toString());
		
	}
	


	
}
