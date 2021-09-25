package examen.finall;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner lectorInt = new Scanner(System.in);
				Scanner lectorString = new Scanner(System.in);
				int opc = 0;
				String a,b;
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
								System.out.println("escoja  el  tipo  de  autoque  desea ingresar: ");
								System.out.println("a) Auto Nacional");
								System.out.println("b) Auto Importado");
								String tipo = lectorString.nextLine();
								switch (tipo) {
								case "a":
									System.out.println("Auto Nacional");
									System.out.println("Ingrese marca del auto");
									String marca = lectorString.nextLine();
									System.out.println("Ingrese modelo del auto");
									String modelo = lectorString.nextLine();
									System.out.println("Ingrese Año de fabricación del auto");
									String anioFabricacion = lectorString.nextLine();
									System.out.println("Ingrese Placa del auto");
									String placa = lectorString.nextLine();
									System.out.println("Ingrese Kilometraje del auto");
									String kilometraje = lectorString.nextLine();
									break;
								case "b":
									System.out.println("Auto Importado");
									System.out.println("Ingrese marca del auto");
									String marca1 = lectorString.nextLine();
									System.out.println("Ingrese modelo del auto");
									String modelo1 = lectorString.nextLine();
									System.out.println("Ingrese Año de fabricación del auto");
									String anioFabricacion1 = lectorString.nextLine();
									System.out.println("Ingrese Placa del auto");
									String placa1 = lectorString.nextLine();
									System.out.println("Ingrese Kilometraje del auto");
									String kilometraje1 = lectorString.nextLine();
									break;

							}
						} 
						}while (opc != 5);
	}
}

