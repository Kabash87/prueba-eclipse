package paquete_bancos;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Pruebas_ramdom_ramdom {

	private static final String EJERCICIO_DE_REPASO = "Ejercicio de Repaso";
	private static int num1;
	private static int num2;
	private static int num3;

	public static void main(String[] args) {
		
		num1 = 5;
		num2 = 67;
		num3 = 12;
		
		int result = num1 + num2;
		int result2 = num3 * num1;
		System.out.println("La primera suma seria un total de: "+result);
		System.out.println("La segunda suma seria un total de: "+result2);
		
		
		System.out.println(EJERCICIO_DE_REPASO);
		System.out.println("Buenos dias! Este es su resumen financiero: \n");
		
		
		
		
		
		String barra = "------------------------------------------------------------";
		DecimalFormat df = new DecimalFormat("#.##");
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> empresas = new ArrayList<String>();
		ArrayList<Float> accionesEmpresas = new ArrayList<Float>();
	    ArrayList<Integer> carteraValor = new ArrayList<Integer>();
	    float valorMadrid = 0;
	    boolean salir = false;
		
	    //Se declaran las empresas que van a estar incluidas dentro de la Cartera de Valores
	    empresas.add("BBVA");
		empresas.add("Santander");
		empresas.add("Deutsche Bank");
		empresas.add("CaixaBank");
		empresas.add("Inditex");
		empresas.add("Repsol");
		
		//Precio de las acciones de las empresas
		accionesEmpresas.add(8.26f);
		accionesEmpresas.add(3.97f);
		accionesEmpresas.add(12.04f);
		accionesEmpresas.add(3.73f);
		accionesEmpresas.add(38.94f);
		accionesEmpresas.add(13.57f);
		
		//Cartera de ACCIONES
		carteraValor.add(5);
		carteraValor.add(6);
		carteraValor.add(3);
		carteraValor.add(2);
		carteraValor.add(5);
		carteraValor.add(4);
		
		
		for (int i = 0; i < empresas.size(); i++) {
		System.out.println("• Dispone de la empresa \""+empresas.get(i)+"\" un total de "+carteraValor.get(i)+" acciones (Con un valor de "+accionesEmpresas.get(i)+"€ cada uno)");
		}
		System.out.println(barra);
		System.out.println("Con un calculo de:");
		for (int i = 0; i < empresas.size(); i++) {
			float valorAcciones = accionesEmpresas.get(i) * carteraValor.get(i);
			System.out.println("• La suma de las acciones de "+empresas.get(i)+" le da un valor final de "+df.format(valorAcciones)+"€");
		
		}
		
		System.out.println(barra);
		
		do {
			System.out.println("Por favor ingresa el resultado del Dia de la Bolsa de Madrid (Valor de Porcentaje)");
			if (sc.hasNextFloat()) {
				valorMadrid = sc.nextFloat();
				salir = true;
			}else {
				System.out.println("Ha ingresado un dato incorrecto, porfavor intente nuevamente");
				sc.next();
				}
		} while (salir == false);
		
		System.out.println("Ha indicado que el mercado ha cambiado un "+valorMadrid+"%");
		System.out.println("Fin del Programa");
		sc.close();
	}
	
}


