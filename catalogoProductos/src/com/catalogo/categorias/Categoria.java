package com.catalogo.categorias;

import java.util.ArrayList;
import java.util.List;

import com.catalogo.proveedores.Proveedores;

public abstract class Categoria implements Proveedores {

	
	private String nombreCategoria = "";
	private static String nombreProveedor;
	protected List<String> categoriaList = new ArrayList<>();
	

	public List<String> agregarCategoria(String cate) {


		categoriaList.add(cate);


		System.out.println("Categoria/s agregada");
		return categoriaList;
	}

	public void cateExistente() {
		categoriaList.add("Electrodomesticos");
		categoriaList.add("Telefonos");
		categoriaList.add("Computadoras");
		categoriaList.add("Zapatos");
		categoriaList.add("Ropa");
	}
	
	public List<String> mostrarCategoria(){	
		boolean isRemoved = categoriaList.remove("Electrodomesticos");
		boolean isRemoved2 = categoriaList.remove("Telefonos");
		boolean isRemoved3 = categoriaList.remove("Computadoras");
		boolean isRemoved4 = categoriaList.remove("Zapatos");
		boolean isRemoved5 = categoriaList.remove("Ropa");
		cateExistente();
		return categoriaList;
	}
	
	public String mostrarCategoriaById(String id){	
//		categoriaList.get(id);
//		return categoriaList.get(id);
		return id;
	}
	
	public static String seleccionarProveedor(int p) {
		
		switch(p) {
		case 1:
			setNombreProveedor("Disasa SA.DE SV");
			break;
		case 2:
			setNombreProveedor("SIMAN");
			break;
		case 3:
			setNombreProveedor("Distribuidora perez");
			break;
		case 4:
			setNombreProveedor("Variedades globales");
			break;
		default:
			setNombreProveedor("Seleccion erronea");
		}
		
		return getNombreProveedor();
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public static String getNombreProveedor() {
		return nombreProveedor;
	}

	public static void setNombreProveedor(String nombreProveedor) {
		Categoria.nombreProveedor = nombreProveedor;
	}

	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}
	
	

}
