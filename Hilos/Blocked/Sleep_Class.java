package Hilos.Blocked;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 02 - 2021
 */
public class Sleep_Class extends Thread{
  @Override
  public void run(){
    for (int i = 0; i<=5; i++) {
      System.out.println("Iniciando: " + i + " " + getName());

      try {
        /* No se necsita crear un objeto dado que estamos
         heredando de la clase Thread, "Recdordemos que la
         herencia nos pemite utilizar atributos y metodos
         de otra clase
        */
          Sleep_Class.sleep(1000);
      } catch(InterruptedException e) {
          System.out.println("Error en Hilo 3: " + e);
      }

      System.out.println("Continuando:... ");
    }
  }
}
