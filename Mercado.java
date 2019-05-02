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
	
	//Metodo que muestra todos los productos y sus propiedades
	public void imprimeProductos() {
		for ( Productos producto : listaDeProductos) {
			producto.detalles();
		}
		System.out.println("=============================");
	}
	
	//Metodo que recorre la listas e imprime el producto mas barato y mas caro
	public void maxYmin(){
		Productos min, max;
		max=this.listaDeProductos.get(0);
		min=this.listaDeProductos.get(0);
		for(Productos producto: listaDeProductos){
			if(producto.compareTo(max)>0){
				max=producto;
			}
			if(producto.compareTo(min)<0){
				min=producto;
			}
		}
		System.out.println("Producto mas caro: "+max.getNombre()+"\n"+""
				+ "Producto mas barato: "+min.getNombre());
	}
}
