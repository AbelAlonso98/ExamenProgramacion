package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import ejercicio1.Camion;
import ejercicio1.Coche;
import ejercicio1.Furgoneta;
import ejercicio1.Microbus;
import ejercicio1.Vehiculo;

public class Empresa {

	public static void main(String[] args) throws IOException {
		Vehiculo v1 = new Coche("W", 4);
		Vehiculo v2 = new Microbus("S", 25);
		Vehiculo v3 = new Furgoneta("A", 1000);
		Vehiculo v4 = new Camion("U", 2500);
		
		Set<Vehiculo> vehiculos = new TreeSet<>();
		vehiculos.add(v1);
		vehiculos.add(v2);
		vehiculos.add(v3);
		vehiculos.add(v4);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el numero de días a alquilar: ");
		int diasAlquiler = sc.nextInt();
		
		vehiculos.forEach(v -> System.out.println(v.toString() +" Precio por "+  diasAlquiler +" dias: " +v.getPrecioAlquiler(diasAlquiler)));

		sc.close();
	}

}
