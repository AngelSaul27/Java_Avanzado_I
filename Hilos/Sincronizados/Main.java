package Hilos.Sincronizados;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 02 - 2021
 */
 public class Main {

   public static void main(String[] args) {
     Hilo1 Uno = new Hilo1();
     Hilo2 Dos = new Hilo2();
     Hilo3 Tres = new Hilo3();
     Hilo4 Cuatro = new Hilo4();

     /*SINCRONIZACION: SE DA UN SLEP DESPUES DE INCIAR CADA
      HILO DE 10 MILISEGUNDOS ASI IMPRIME TODO DE MANERA RAPIDA
      EN UNA SOLA LINEA Y EN CADA CLASE EL HILO SE DETENDRA
      100SEG POR LO CUAL, AL ESTABLECER 10MILISEG INICIAN TODOS
      LOS HILOS EN 100SEG DE ESPERA SINCRONIZANDOSE*/

     //HILO 1
     Uno.start();
     try {
       Hilo1.sleep(10);
     } catch(InterruptedException e) {
       System.out.println("Error En Hilo 1: " + e);
     }

     //HILO 1
     Dos.start();
     try {
       Hilo2.sleep(10);
     } catch(InterruptedException e) {
       System.out.println("Error En Hilo 2: " + e);
     }

     //HILO 1
     Tres.start();
     try {
       Hilo3.sleep(10);
     } catch(InterruptedException e) {
       System.out.println("Error En Hilo 3: " + e);
     }

     //HILO 1
     Cuatro.start();
     try {
       Hilo4.sleep(10);
     } catch(InterruptedException e) {
       System.out.println("Error En Hilo 4: " + e);
     }
   }
}
