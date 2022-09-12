package Random_;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 02 - 2021
 */
public class RandoMath {
  /*EXISTEN DOS ALTERNATIVAS PARA GENERAR NUMERO ALEATORIO
  LA PRIMERA HACE USO DE LA CLASE MATH SEGUIDO DEL METODO
  RANDOM Y MULTIPLICAMOS POR 100 QUE ES EL RANGO QUE ABARCARA
  NUESTROS NUMEROS ALEATORIO, ES DECIR DEL 0 AL 100 NOS GENERA
  UN NUMERO ALEATORIO.

  COMO SEGUNDA OPCION DEBEMOS IMPORTAR LA CLASE RANDOM */

  /*castin: conversion de un numero a otro, dado que se nos 
    devuelve un valor de tipo double*/

    public static void main(String[] args) {
      int aleatorio = 0;

      aleatorio = (int) (Math.random() * 100);
      System.out.println(aleatorio);
    }
}
