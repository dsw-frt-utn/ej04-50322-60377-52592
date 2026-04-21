/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;
import domain.*;

public class AltaVehiculo {

    public static Vehiculo crearVehiculo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese marca: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese país: ");
        String pais = sc.nextLine();

        Marca marca = new Marca(nombre, pais);

        System.out.print("Ingrese patente: ");
        String patente = sc.nextLine();

        System.out.print("Ingrese modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese año: ");
        int anio = sc.nextInt();

        System.out.print("Capacidad de carga: ");
        double capacidad = sc.nextDouble();

        System.out.print("Km por litro: ");
        double kmLitro = sc.nextDouble();

        System.out.print("Litros extra: ");
        double litrosExtra = sc.nextDouble();

        sc.nextLine();

        return new VehiculoCombustible(
                patente,
                marca.getNombre(),
                modelo,
                anio,
                capacidad,
                null,
                kmLitro,
                litrosExtra
        );
    }
}