package ejerciciosPNT;



import java.util.LinkedList;
import java.util.List;

public class Mercado {
	
	private List<Productos> listaDeProductos;
	
	public Mercado() {
		this.listaDeProductos=new LinkedList<Productos>();
	}
	
	public void agregarProducto(Productos prod){
		this.listaDeProductos.add(prod);
	}

	//Crea la lista
	public void Productos() {
		Productos z=new CocaCola("Coca-Cola Zero", 20,1.5);
		Productos cc=new CocaCola("Coca-Cola", 18,1.5);
		Productos ss=new Shampoo("Shampoo Sedal", 19, 500);
		Productos f=new Frutillas("Frutillas",64,"kilo" );
		//Los agrega a la lista
		this.agregarProducto(z);
		this.agregarProducto(cc);
		this.agregarProducto(ss);
		this.agregarProducto(f);
	}
	//Metodo que contiene todos los objetos
	public void metXprod() {
		for ( Productos producto : listaDeProductos) {
			producto.detalles();
		}
		System.out.println("=============================");
	}
	
	//Muestra el producto mas caro
	public void masCaro() {
		Productos max;
		max=this.listaDeProductos.get(0);
		for (Productos producto : listaDeProductos) {

			if (producto.compareTo(max)>0) {
				max=producto;
			}
		}
		System.out.println("Producto más caro: "+max.getNombre()); 
	}
	
	//Muestra el producto mas barato
	public void masBarato() {
		Productos min;
		min=this.listaDeProductos.get(0);
		for (Productos producto : listaDeProductos) {
			if (producto.compareTo(min)<0) {
				min=producto;
			}
		}
		System.out.println("Producto más barato: "+min.getNombre());
		}
}
