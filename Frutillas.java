package ejerciciosPNT;

public class Frutillas extends Productos {
	String uniPeso;
	public Frutillas(String nombre, int precio, String uniPeso) {
		super(nombre, precio);
		this.uniPeso=uniPeso;
		}
	@Override
	public String toString(){
		String prod="Nombre: "+nombre+" ///"+ "Precio: "+"$"+precio+" ///"+" Unidad de venta: "+uniPeso;
		return prod;
	}
}
