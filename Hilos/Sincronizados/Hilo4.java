package Hilos.Sincronizados;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 02 - 2021
 */
public class Hilo4 extends Thread{
    @Override
    public void run(){
      for (int i = 0; i < 10;i++ ) {
        System.out.println("L");

        try {
          Hilo1.sleep(4000);
        } catch(InterruptedException e) {
          System.out.println("Error En Hilo 1: " + e);
        }

      }

    }
}
