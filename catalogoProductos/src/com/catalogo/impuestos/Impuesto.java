package com.catalogo.impuestos;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Optional;

import com.catalogo.productos.Productos;

public class Impuesto {

	static double precioIVA;
	static double precioImpuestos;
	static double total;
//	static private ArrayList<Productos> listaProduct = new ArrayList<>();
	
	public static double totalIVA(double precio) {
		return precio + (precio * 0.13);
	}

	public static double totalImpuestos(double precio, double imp) {
		return precio + (precio * imp) + (precio * 0.13);
	}
	
}
	