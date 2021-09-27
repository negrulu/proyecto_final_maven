package proyecto.auto;
import java.util.Scanner;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaOpcion1 = new Scanner(System.in);
		Scanner entradaOpcion2 = new Scanner(System.in);
		Scanner entradaCaracter = new Scanner(System.in);
		int opcionMenu;
		char opcionCliente;
		char opcionEmpleado;
		Auto autos[] = new Auto[0];
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaEntrega = LocalDate.now().plusDays(2);
		Automovil automovil1 = new Automovil();
		Camioneta camioneta1 = new Camioneta();
		Cliente cedula1 = new Cliente();
		int posicionVector = 0;
		
		
		do {
			System.out.println("Bienvenido a Concesionario 'Paz'");
			System.out.println("Que tipo de usuario es:");
			System.out.println("1. Cliente");
			System.out.println("2. Empleado");
			System.out.println("3. Salir");
			opcionMenu = entradaOpcion1.nextInt();
			
			//cliente
			switch(opcionMenu) {
			case 1:
				System.out.println("Que desea hacer cliente: ");
				System.out.println("a. Consultar Auto");
				System.out.println("b. Reservar Auto");
				opcionCliente = entradaOpcion2.next().charAt(0);
				
				switch(opcionCliente) {
				//consultar
				case 'a':
					System.out.println("Ingrese el modelo del auto: ");
					String consultarModelo = entradaCaracter.nextLine();
					System.out.println("Ingrese la marca del auto: ");
					String consultarMarca = entradaCaracter.nextLine();
					
					for (int i = 0; i < autos.length; i++) {
						Auto busquedaAuto = autos[i];
						
						boolean buscar = busquedaAuto.getModelo().equals(consultarModelo);
						boolean buscar2 = busquedaAuto.getMarca().equals(consultarMarca);

						if (buscar == true && buscar2 == true) {
							System.out.println("Placa: " + autos[i].getPlaca() + " - Modelo: " + autos[i].getModelo() + 
									" - Marca: " + autos[i].getMarca()+ " - Año: " + autos[i].getAnioFabricacion() 
									+ " - Estado: " + autos[i].getEstado() + " - Fecha Entrega: " + autos[i].getFechaEntrega());
						}

					}
				break;
				//reservar
				case 'b':
					System.out.println("Ingrese la placa del auto que desea reservar: ");
					String placa = entradaCaracter.nextLine();
					System.out.println("Ahora ingrese su cedula: ");
					String cedula = entradaCaracter.nextLine();
					for (int i = 0; i < autos.length; i++) {
						Auto consultaAuto = autos[i];
						boolean buscar = consultaAuto.getPlaca().equals(placa);
						
						if (buscar == true) {
							
							if (consultaAuto.getEstado().equals("Disponible")) {
								consultaAuto.setEstado("Reservado");
								consultaAuto.setFechaReserva(fechaHoy);
								consultaAuto.setFechaEntrega(fechaEntrega);
								
								System.out.println(fechaHoy.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
								
								cedula1.setCedula(cedula);
								System.out.println(autos[i].getFechaEntrega());
								System.out.println("El auto ha sido correctamente reservado");
								
								System.out.print(autos[i]);
							} else {
								System.out.println("Lo siento, el auto no esta disponible");
								System.out.println("El auto estara disponible en: " + autos[i].getFechaEntrega()
										.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));

							}

						} else {
							System.out.println("No se encontro el auto en la base de datos");
						}
					}
				break;
				default:
					System.out.println("Por favor ingrese una opcion valida");
				}				
			break;
			
			//empleado
			case 2:
				System.out.println("Que desea hacer empleado: ");
				System.out.println("a. Ingresar un Auto");
				System.out.println("b. Alquilar un Auto");
				System.out.println("c. Aplazar fecha de entrega");
				opcionEmpleado = entradaOpcion2.next().charAt(0);
				switch (opcionEmpleado) {
				//ingresar
				case 'a':
					Auto ingresoAuto = new Auto();
					
					Auto arrayTemporal[] = new Auto[autos.length + 1];
					for (int i = 0; i < autos.length; i++) {
						arrayTemporal[i] = autos[i];
					}
					ingresoAuto.setEstado("Disponible");
					
					System.out.print("Ingrese la placa: ");
					String placa = entradaCaracter.nextLine();
					ingresoAuto.setPlaca(placa);
					System.out.print("Ingrese el modelo: ");
					String modelo = entradaCaracter.nextLine();
					ingresoAuto.setModelo(modelo);
					System.out.print("Ingrese la marca: ");
					String marca = entradaCaracter.nextLine();
					ingresoAuto.setMarca(marca);
					System.out.print("Ingrese el año de fabricacion: ");
					String anioFabricacion = entradaCaracter.nextLine();
					ingresoAuto.setAnioFabricacion(anioFabricacion);
					System.out.print("Ingrese el pais de fabricacion: ");
					String paisFabricacion = entradaCaracter.nextLine();
					ingresoAuto.setPaisFabricacion(paisFabricacion);
					System.out.print("Ingrese el cilindraje: ");
					String cilindraje = entradaCaracter.nextLine();
					ingresoAuto.setCilindraje(cilindraje);
					System.out.print("Ingrese el avaluo: ");
					String avaluo = entradaCaracter.nextLine();
					ingresoAuto.setAvaluo(avaluo);
					String numeroPuertas;
					String peso;
					
					System.out.println("Ingrese el tipo de auto: ");
					System.out.println("1. Automovil");
					System.out.println("2. Camioneta");
					String tipoAuto = entradaCaracter.nextLine();
					
					if (tipoAuto.equals("1")) {
						System.out.println("Ingrese el numero de puertas: ");
						numeroPuertas = entradaCaracter.nextLine();
						automovil1.setNumeroPuertas(numeroPuertas);
						ingresoAuto.setAutomovil(automovil1);
					} else if (tipoAuto.equals("2")) {
						System.out.println("Ingrese el peso soportado: ");
						peso = entradaCaracter.nextLine();
						camioneta1.setPeso(peso);
						ingresoAuto.setCamioneta(camioneta1);
					}
					arrayTemporal[posicionVector] = ingresoAuto;
					posicionVector++;
					System.out.println("El auto fue ingresado");
				break;
				
				//alquilar
				case 'b':
					System.out.println("Ingrese la placa del auto: ");
					String placaEmpleado = entradaCaracter.nextLine();
					for (int i = 0; i < autos.length; i++) {
						Auto buscarAuto = autos[i];
						boolean buscar = buscarAuto.getPlaca().equals(placaEmpleado);
						if (buscar == true && buscarAuto.getEstado().equals("Reservado")) {
							System.out.println("Placa: " + autos[i].getPlaca() + " - Modelo: "
									+ autos[i].getModelo() + " - Estado: " + autos[i].getEstado() + " - Fecha Entrega: "
									+ autos[i].getFechaEntrega().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
									+ " - Reservado por: " + autos[i].getCedula());
							
							System.out.println("Que desea hacer con ese auto: ");
							System.out.println("1. Alquilar");
							System.out.println("2. No Alquilar");
							int opcionAlquilar = entradaCaracter.nextInt();
							
							switch(opcionAlquilar) {
							case 1:
								buscarAuto.setEstado("Alquilado");
								System.out.println("La placa del auto que alquilo es: " + autos[i].getPlaca());
								System.out.println("Entregar el auto el: " + autos[i].getFechaEntrega()
										.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
								System.out.println(autos[i]);
							break;
							case 2:
								System.out.println("Usted decidio no alquilar el auto");
							break;
							}
							
						}else {
							System.out.println("El auto no esta reservado");
						}
					}
				break;
				
				//aplazar fecha
				case 'c':
					System.out.print("Ingrese la placa: ");
					String buscarPlaca = entradaCaracter.nextLine();
					System.out.print("Ingrese la cedula del cliente: ");
					String cedulaCliente = entradaCaracter.nextLine();
					
					for (int i = 0; i < autos.length; i++) {
						Auto busquedaAuto = autos[i];
						cedula1.setCedula(cedulaCliente);
						boolean buscar = busquedaAuto.getPlaca().equals(buscarPlaca)
								&& busquedaAuto.getEstado().equals("Alquilado");
						boolean buscar2 = busquedaAuto.getCedula().equals(cedula1);
						
						if (buscar == true && buscar2 == false) {
							System.out.println("Placa: " + autos[i].getPlaca() + " - Modelo: " + autos[i].getModelo()
									+ " - Estado: " + autos[i].getEstado() + " - Fecha Entrega: " 
									+ autos[i].getFechaEntrega().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
									+ " - Alquilado por: " + autos[i].getCedula());

								System.out.println("Que desea hacer con la fecha de entrega: ");
								System.out.println("1. Aplazar");
								System.out.println("2. No Aplazar");
								String opcionAplazo = entradaCaracter.nextLine();

								switch (opcionAplazo) {

								case "1":
									Auto aplazarFecha = autos[i];
									LocalDate aplazarDia = autos[i].getFechaEntrega().plusDays(3);
									aplazarFecha.setFechaEntrega(aplazarDia);
									System.out.println("La fecha de entrega se aplazara 3 dias");
									break;
								case "2":
									System.out.println("No se aplazara ninguna fecha");
									break;

								}

						} else {
							System.out.println("No se encontro el auto");
						}
					}
				break;
				default:
					System.out.println("Ha ingresado una opcion invalida");
				break;
				}
			break;
			}
						
		}while(opcionMenu<=2);
		
	}

}
