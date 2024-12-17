package com.ejercicio8;

import java.util.Scanner;

public class PerimetroBaseApotema_Prisma_Pent {

	public static void main(String[] args) {
		//Construya el algoritmo tal que, dado el perímetro de la base, la apotema y
		//la altura de un prisma pentagonal; calcule el área de la base, el área lateral,
		//el área total y el volumen.
		Scanner entrada = new Scanner(System.in);
		double perimetro, apotema, altura, aTotal, aLado, aBase, volumen;
		//Leer datos...
		System.out.println("Ingresa el perimetro de la Base: ");
		perimetro = entrada.nextDouble();
		System.out.println("Ingresa la apotema: ");
		apotema = entrada.nextDouble();
		System.out.println("Ingresa la altura: ");
		altura = entrada.nextDouble();
		aBase = (perimetro * apotema) / 2;
		aLado = perimetro * altura;
		aTotal = (2 * aBase) + aLado;
		volumen = aBase * altura;
		System.out.println("El area de la base es: " + aBase);
		System.out.println("El area lateral es: " + aLado);
		System.out.println("El area total es: " + aTotal);
		System.out.println("El volumen del prisma pentagonal es: "+ volumen);
	}
}
