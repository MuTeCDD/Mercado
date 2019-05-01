package ejerciciosPNT;

public class Run {

	public static void main(String[] args) {
		Productos zero=new CocaCola("Coca-cola zero", 20,1.5);
		Productos coca=new CocaCola("Coca-cola", 18,1.5);
		Productos shampoo=new Shampoo("Shampoo Sedal", 19,500);
		Productos frutillas=new Frutillas("Frutillas", 64, "Kilo");
		
		System.out.println(zero);
		System.out.println(coca);
		System.out.println(shampoo);
		System.out.println(frutillas);
		System.out.println("==============================");
		Mercado mercado=new Mercado();
		mercado.Productos();
		mercado.masCaro();
		mercado.masBarato();
		}
}
