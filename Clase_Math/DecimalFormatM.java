package Clase_Math;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * @author Angel Saul Pascual Camacho
 * @version 08 - 02 - 2021
 */
public class DecimalFormatM {

    public static void main(String[] args) {
        double Numero = 2;
        double Raiz = Math.sqrt(Numero);

        System.out.println("La raiz cuadrada de " + Numero + " es: " + Raiz);

        //Utilizacion de la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        /*AGREGAMOS EL #. Y SEGUIDO DE LAS CANTIDADES DE DECIMALES A MOSTRAR*/

        System.out.println("La raiz cuadrada de " + Numero + " es: " + df.format(Raiz));

        //Utilizando String.format
        System.out.println("La raiz cuadrada de " + Numero + " es: " + String.format("%.2f", Raiz));
        /*AGREGAMOS EL %. SEGUIDO DE LA CANTIDAD DE DECIMALES A MOSTRAR Y LA LETRA f, POR ULTIMO,
      AÑADIMOS UNA COMA Y LA VARIABLE DEL RESULTADO A MOSTRAR ES DECIR (%.2f,Raiz)
      MUESTRA DOS DECIMALES DE LA VARIABLE RAIZ*/

        System.out.println("La raiz cuadrada de " + Numero + " es: " + (double)Math.round(Raiz * 100d) / 100);
        /* primero debemos convertir los valores a double, dado que para la clase Math
         debemos utilizar valores de tipo double, fuera de los parentesis hacemos uso de la
         clase math seguido del metodo round, posteriormente entre los parentesis colocamos
         la variable que contiene el resultado y mutiplicamos 100d y fuera del parentesis dividimos
         por 100 con esto le indicamos que imprimiremos solo 2 decimales, si decearamos imprimir mas
         decimales solo agregamos mas 0 al 100d y a la division
         */

        //BIGDECIMAL
        BigDecimal bd = new BigDecimal(Raiz);
        /*Primero creamos un objeto de la clase BigDecimal pasandole por parametros la
      variable que tiene nuestro decimal a limitar */
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        /*indicamos que nuestro objeto creado es igual si mismo pero estableciendole un
      setScale, donde indicaremos los decimales a mostrar seguido de la clase RoundingMode seguido
      de .HALF_UP: redondea si es necesario este dependera de la escala es decir si es
      mayor o igual a 0.5 se redondea si es menor se redondea hacia abajo*/
        System.out.println("La raiz cuadrada de, " + Numero + " es: " + bd.doubleValue());
        /*Para mostrar nuestro valor colocamos nuestro objeto seguido de doubleValue()*/
    }
}
