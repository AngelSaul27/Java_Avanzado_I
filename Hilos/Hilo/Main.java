package Hilos.Hilo;
/**
 * @author Angel Saul Pascual Camacho
 * @version 02 - 02 - 2021
 */
public class Main {

   public static void main(String[] args) {
     /* SE INSTANCIA DE FORMA NORMAL SIEMPRE Y CUANDO 
     SE HEREDE DE LA CLASE THREAD*/
     /* EN EL CASO DE IMPLEMENTAR LA CLASE RUNNABLE 
     SE DEBE INSTANCIAR LA CLASE THREAD Y DESPUES 
     INDICAR QUE LA FUNCION SE ENCUENTRA EN LA CLASE X */
     
     Proceso2 PB2 = new Proceso2();
     Thread PB1 = new Thread(new Proceso1());

     PB2.start();
     PB1.start();
   }
}
