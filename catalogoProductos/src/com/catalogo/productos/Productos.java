package com.catalogo.productos;

import java.util.ArrayList;
import java.util.List;

import com.catalogo.categorias.Categoria;

public class Productos extends Categoria {
//	private String nombrePro;
//	private double precioPro;
//	private int cantidad;
//	private String categoriaPro;
//	private boolean contains;
	static private List<String> productList = new ArrayList<>();
	static private List<Integer> listaCategoria = new ArrayList<>();
	static private List<Double> precioList = new ArrayList<>();
	// private List<String> listCategoria = new ArrayList<>();

//	public Productos(double precioPro) {
//		this.nombrePro = nombrePro;
//		this.precioPro = precioPro;
//		this.cantidad = cantidad;
//		this.categoriaPro = categoriaPro;
////		this.productList = productList;
//	}

	public static List<String> agregarProducto(String pro, double precio, int categoria) {

		precioList.add(precio);
		listaCategoria.add(categoria);
		productList.add(pro);

		System.out.println("Producto/s agregado");
		return productList;
	}

	// filtro para la busqueda por precio
	public static String productosByPrecio(double precio) {
		int y = 0;

		if (precioList.contains(precio)) {
			y = precioList.indexOf(precio);
		}
		return productList.get(y);
	}
	// fin filtro para la busqueda por precio

	// inicio busqueda por categoria
	public String productosByCategoria(String cate) {
		int x = 0;

		if (listaCategoria.contains(cate)) {
			x = listaCategoria.indexOf(cate);
		}
		return productList.get(x);

	}
	// fin inicio busqueda por categoria

	/* *********************** */
	//intento de filtro para varios elementos del array
	/* *********************** */
	
//	  public static String productosPorPrecio(double min, double max) { int x = 0;
//	  
//	  
//	  if(precioList.contains(min) && precioList.contains(max)) { 
//	  for(double i=min;i<=max; i++) {
//	  
//	  if(precioList.indexOf(i) == i) { x = precioList.indexOf(i); } } } //
//	  productList.get(x); // System.out.println(x); return productList.get(x);
//	  
//	  }
//	 
	public List<String> getProductList() {
		return productList;
	}

}
