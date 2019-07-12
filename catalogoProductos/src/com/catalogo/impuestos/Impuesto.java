package com.catalogo.impuestos;

public class Impuesto {

	static double precioIVA;
	static double precioImpuestos;
	static double total;
	
	public static double totalIVA(double precio) {
		return precio+(precio*0.13);
	}
	
	public static double totalImpuestos(double precio, double imp ) {
		return precio+(precio*imp)+(precio*0.13);
	}
}
