package clasesNuevas;

public class validacionDeNumeros {
    public static String elNumeroEsPositivoONegativo(int numero){
        String resultado = "";

        //int num = Integer.parseInt(numero); // antes "1" convierto a 1 Error

        if(numero == 0){ // a == 0 No cumple no ingreso
            resultado = "Es igual a cero";
        } else if (numero > 0) { // Entonces si a es mayor a cero ingresamos en caso de que no, proseguimos
            resultado = "Positivo";
        } else { // Entonces validamos que num sea menor a cero, si cumple ingreso, sino no ingreso
            resultado = "Negativo";
        }
        return resultado;
    }
    //1a parte 
    //Cargar cambios en rama de Git ramaPozos
    //Pull request a master
    //Regresar a repositorio local, me cambio a master y hago un pull origin master
    //Una vez actualizada rama master en local, cambiar a ramaPozos
    //Hacer un git pull origin ramaPozos para corroborar
    //2a parte
    //Funcion que se llame elNumeroIngresadoEsParOImpar
    //Funcion que se llame cualNumeroEsMayor
    // Mandar llamar las funciones en clase holaMundo
}
