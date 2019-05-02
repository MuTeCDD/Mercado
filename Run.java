package ejerciciosPNT;

public class Run {

	public static void main(String[] args) {
		Mercado mercado=new Mercado();
		
		//Crea la lista con todos los productos(Constructores)
		mercado.Productos();
		
		//Muestra los productos en un unico metodo
		mercado.imprimeProductos();
		
		//Muestra el producto mas caro y el mas barato
		mercado.maxYmin();

		}
}
