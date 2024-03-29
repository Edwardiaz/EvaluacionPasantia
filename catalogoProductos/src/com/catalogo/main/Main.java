package com.catalogo.main;

import java.util.List;
import java.util.Scanner;

import com.catalogo.categorias.Categoria;
import com.catalogo.impuestos.Impuesto;
import com.catalogo.productos.Productos;

public class Main {

	public static void main(String[] args) {

		String cate, productName, cat;
		double precio = 0;
		double extra;
		int opc = 0, cantidad, idProveedor = 0,  min = 0, max;
		boolean bool = true, bool2 = true;
		List<Categoria> listaCategoria;
		
		Productos proCate = new Productos();
		Impuesto imp = new Impuesto();
		Scanner sc = new Scanner(System.in);

		while (bool2 == true) {
			// Menu Principal
			System.out.println("***********************************************");
			System.out.println("*****Bienvenidos al Catalogo de productos*****");
			System.out.println("Agregue productos cada vez que inicie el programa...");
			System.out.println("Seleccione una opcion del menu:"
								+ "\n1. Agregar productos"
								+ "\n2. Mostrar productos por categoria"
								+ "\n3. Mostrar todos los productos en un rango de precios"
								+ "\n4. Agregar mas categorias"
								+ "\n5. Salir del programa");
			System.out.println("***********************************************");
			opc = sc.nextInt();
			switch (opc) {
			case 1:

				System.out.println("Ingrese los siguientes datos:");
				System.out.println("Nombre del producto: ");
				productName = sc.next();
				System.out.println("Precio del producto: ");
				precio = sc.nextDouble();
				System.out.println("Impuesto extra(aplicable con cantidades superiores a $75)");
				extra = sc.nextDouble();
				System.out.println("Cantidad de " + productName + " :");
				cantidad = sc.nextInt();
				System.out.println("Seleccione al proveedor: " 
									+ "\n1. Disasa SA.DE SV" 
									+ "\n2. SIMAN"
									+ "\n3. Distribuidora perez" 
									+ "\n4. Variedades globales");
				do {
					try {

						idProveedor = Integer.parseInt(sc.nextLine());
						if (idProveedor >= 1 && idProveedor < 5) {
							bool = false;
						}
					} catch (Exception e) {
						System.out.println("Solo numeros entre 1 al 4");
						bool = true;
					}
				} while (bool == true);
				System.out.println("Digite una categoria existente de la siguiente lista: ");
				System.out.println(proCate.mostrarCategoria());
				String idCategoria = sc.next();
				System.out.println("***************************************");
				System.out.println("\nDetalles de insercion: ");

				System.out.println("producto guardado: " + Productos.agregarProducto(productName, precio, idCategoria));
				System.out.println("Nombre producto: " + productName);
				System.out.println("Precio: " + precio);
				System.out.println("Categoria: " + proCate.mostrarCategoriaById(idCategoria));
				System.out.println("Precio con IVA: " + Impuesto.totalIVA(precio));
				System.out.println("Impuesto Extra: " + extra);
				if (precio > 75) {
					System.out.println("EL PRODUCTO APLICA AL IMPUESTO EXTRA");
//					total = precio+(precio*extra)+(precio*0.13); //como referencia
					System.out.println("Total con impuesto(IVA + extra): " + Impuesto.totalImpuestos(precio, extra));
				} else {
					System.out.println("El producto NO aplica al impueto EXTRA");
//					total = precio+(precio*0.13); //REFERENCIA DEL CALCULO
					System.out.println("Total con impuesto(IVA): " + Impuesto.totalIVA(precio));

				}
				System.out.println("Proveedor: " + Categoria.seleccionarProveedor(idProveedor));
				bool2 = true;
				break;
			case 2:
				System.out.println("*****Busqueda por CATEGORIA*****");
				System.out.println("Digite una categoria: ");
				cat = sc.next();
				System.out.println("********************************");
				System.out.println("los elementos por categoria son: " + proCate.productosByCategoria(cat));
				System.out.println("********************************");
				break;
			case 3:

				System.out.println("*****Busqueda por rango de precio*****");
				System.out.println("Ingrese un precio : ");
//				System.out.println("Rango minimo: ");
				System.out.println("Digite el precio del producto");
				min = sc.nextInt();
//				System.out.println("Rango maximo: ");
//				max = sc.nextInt();
				System.out.println("********************************");
				System.out.println("los elementos son: ");
//				System.out.println(Productos.productosByPrecio(min, max));
				System.out.println(Productos.productosByPrecio(min));
				System.out.println("********************************");

				break;
			case 4:
				// inicio agregado categoria
				System.out.println("Ingrese la categoria (Electrodomesticos, Telefonos, Computadoras, Zapatos, Ropa):");
				cate = sc.next();
				proCate.agregarCategoria(cate);
				bool2 = true;
				System.out.println(proCate.mostrarCategoria());
				// fin agregado categoria
				break;
			case 5:
				bool2 = false;
				System.out.println("FINALIZANDO PROGRAMA");
			default:
				System.out.println("Opcion Erronea... Saliendo del programa");

			}
			// fin Menu Principal
		}
	}

}
