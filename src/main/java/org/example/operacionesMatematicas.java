package org.example;

public class operacionesMatematicas {
    public static String operacionSuma(int num1, int num2) {
       // int resultadoSuma = num1 + num2;
       // return "El resultado de la suma de los números es: " + resultadoSuma;
        return "El resultado de la suma de los números es: " + (num1+num2); // aquí va a imprimir 8, porque está considerando el valor de los parentesis como operacion matematica
    }
    public static String operacionResta(int num1, int num2) {
        // return "El resultado de la resta de los números es: " + resultadoResta;
        return "El resultado de la resta de los números es: " + (num1-num2);
    }
    public static String operacionMultiplicacion(int num1, int num2) {
        // return "El resultado de la multiplicacion de los números es: " + resultadoMultiplicacion;
        return "El resultado de la multiplicacion de los números es: " + (num1*num2);
    }
    public static String operacionDivision(int num1, int num2) {
        // return "El resultado de la division de los números es: " + resultadoDivision;
        return "El resultado de la division de los números es: " + (num1/num2);
    }


}
