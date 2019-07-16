package com.catalogo.productos;

import java.util.ArrayList;
import java.util.List;

import com.catalogo.categorias.Categoria;

public class Productos extends Categoria {

	static private List<String> productList = new ArrayList<>();
	static private List<String> listaCategoria = new ArrayList<>();
	static private List<Integer> precioList = new ArrayList<>();
	
	public static List<String> agregarProducto(String pro, int precio, String categoria) {

		precioList.add(precio);
		listaCategoria.add(categoria);
		productList.add(pro);

		System.out.println("Producto/s agregado");
		return productList;
	}

	// filtro para la busqueda por precio
	public static String productosByPrecio(int precio) {
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

//	public static String productosByPrecio(int min, int max) {
//	int m = 0, M = 0, y=0;
//	if (precioList.contains(min) && precioList.contains(max)) {
//		m = precioList.indexOf(min);
//		M = precioList.indexOf(max);
//	}
//	
//	List<Integer> sublista = precioList.subList(m, M);
//	for(Integer p: sublista) {
//		System.out.println(p);
//		y = precioList.indexOf(p);
//	}
//	return productList.get(y);
//} 
	
	/* *********************** */
	//FIN intento de filtro para varios elementos del array
	/* *********************** */
	public List<String> getProductList() {
		return productList;
	}

}
