package examen.finall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner lectorInt = new Scanner(System.in);
				Scanner lectorString = new Scanner(System.in);
				int opc = 0;
				String a,b;
				String marca = "";
				String modelo = "";
				String anioFabricacion = "";
				String placa = "";
				int kilometraje = 0;
				
				Auto [] datos=new Auto[100];
						do {
							System.out.println("#######################################");
							System.out.println("####   CONCESIONARIO AMBACAR       ####");
							System.out.println("####   1. Ingresar Auto            ####");
							System.out.println("####   2. Consultar Auto           ####");
							System.out.println("####   3. Actualizar Kilometraje   ####");
							System.out.println("####   4. Imprimir Reporte         ####");
							System.out.println("####   5. SALIR                    ####");
							System.out.println("#######################################");
							System.out.println("Ingrese una Opcion: ");
							opc = lectorInt.nextInt();
							if (opc == 1) {
								for(int i=0;i<datos.length;i++) {
								System.out.println("escoja  el  tipo  de  autoque  desea ingresar: ");
								System.out.println("a) Auto Nacional");
								System.out.println("b) Auto Importado");
								String tipo = lectorString.nextLine();
								switch (tipo) {
								case "a":
									System.out.println("Auto Nacional");
									System.out.println("Ingrese Código Nacional");
									String codigoNacional = lectorString.nextLine();
									System.out.println("Ingrese marca del auto");
									 marca = lectorString.nextLine();
									System.out.println("Ingrese modelo del auto");
									 modelo = lectorString.nextLine();
									System.out.println("Ingrese Año de fabricación del auto");
									 anioFabricacion = lectorString.nextLine();
									System.out.println("Ingrese Placa del auto");
									 placa = lectorString.nextLine();
									System.out.println("Ingrese Kilometraje del auto");
									 kilometraje = lectorInt.nextInt();
									break;
								case "b":
									System.out.println("Auto Importado");
									System.out.println("Ingrese Código Importacion");
									String codigoImportacion = lectorString.nextLine();
									System.out.println("Ingrese marca del auto");
									 marca = lectorString.nextLine();
									System.out.println("Ingrese modelo del auto");
									 modelo = lectorString.nextLine();
									System.out.println("Ingrese Año de fabricación del auto");
									 anioFabricacion = lectorString.nextLine();
									System.out.println("Ingrese Placa del auto");
									 placa = lectorString.nextLine();
									System.out.println("Ingrese Kilometraje del auto");
									 kilometraje = lectorInt.nextInt();
									break;
								}
								}
								}else if(opc==2) {
										System.out.print("Ingrese numero de Placa a Encontrar: ");
										 String placaBuscar=lectorString.nextLine();
										 String placa1 = "";
								
										for(int i=0;i<datos.length;i++) {
									Auto autos = datos[i];
										placa1 = autos.getPlaca();
										
										if(placaBuscar.equals(placa1) && placaBuscar==placa) {
											System.out.println("Se encontro");
											
										}else {
											System.out.println("No Se encontro");
										}
						} 
							}
						}while (opc != 5);
	
}
}

