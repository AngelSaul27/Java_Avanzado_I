package Hilos.Hilo;
/**
 * @author Angel Saul Pascual Camacho
 * @version 02 - 02 - 2021
 */
public class Proceso1 implements Runnable{
  /*LA PRIMERA FORMA DE HACER USO DE LOS HILOS ES
  IMPLEMENTANDO LA CLASE RUNNABLE E IMPLEMENTAR SUS
  METODOS*/

  @Override //Sobreecritura
  public void run(){ // Clase run
    for(int i=0; i<10; i++){
        System.out.println("P1: "+i);
    }
  }

}
