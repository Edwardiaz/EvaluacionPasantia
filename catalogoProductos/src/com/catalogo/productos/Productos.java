package com.catalogo.productos;

import java.util.ArrayList;
import java.util.List;

import com.catalogo.categorias.Categoria;

public class Productos extends Categoria{
//	private String nombrePro;
//	private double precio;
//	private int cantidad;
//	private Categoria categoria;
	private List<String> productList = new ArrayList<>();
	
	public List<String> agregarProducto(String pro, double precio, int categoria) {

		productList.add(pro);

		System.out.println("Producto/s agregado");
		return productList;
	}
}
