package Herencia;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Clase_Padre {
  /* ESTA CLASE NO HERADA DE NADIE POR LO TANTO ES NUESTRA
     CLASE PADRE O SUPER CLASE [CLASE PRINCIPAL] SU CONTENIDO
     SERA COMPARTIDO SI TIENE UNA SUB CLASE O CLASE HIJA*/

     //private int Numero = 5;
     protected int Numero1 = 10;
     public int Numero2 = 20;
     int Numero3 = 40;

     public void Suma(){
       System.out.println("Accedio Al Metodo Suma");
     }

     protected void Multiplicacion(){
       System.out.println("Accedio Al Metodo Multiplicacion");
     }

     private void Resta(){
       System.out.println("Sin Acceso Para Ninguna Clase");
     }

     public void Imprima(){
       System.out.println("Accedio Al Metodo Restado");
       Resta();
     }
}
