package org.example;

import static clasesNuevas.validacionDeNumeros.elNumeroEsPositivoONegativo; //Estoy importando el paquete, con las clases y el metodo

import clasesNuevas.validacionDeNumeros;

public class holaMundo {
    public static void main (String[] args){
        System.out.println("Hola mundo, mi nombre es Brenda Salazar :) ");
        System.out.println("Nuestras operaciones matematicas creadas son: ");
        System.out.println(operacionesMatematicas.operacionSuma(11,5));
        System.out.println(operacionesMatematicas.operacionResta(50,5));
        System.out.println(operacionesMatematicas.operacionMultiplicacion(11,5));
        System.out.println(operacionesMatematicas.operacionDivision(150,5));

        System.out.println("El número que ingresaste es " + elNumeroEsPositivoONegativo(0));
        System.out.println("El número que ingresaste es " + elNumeroEsPositivoONegativo(-10));
        System.out.println("El número que ingresaste es " + elNumeroEsPositivoONegativo(20));
        //System.out.println("El número que ingresaste es" + validacionDeNumeros.elNumeroEsPositivoONegativo(0)); // se pone clase.el metodo en caso de que no importe el paquete
    }
}
