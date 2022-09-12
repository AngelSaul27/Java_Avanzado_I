package Hilos.Parametros;
/**
 * @author Angel Saul Pascual Camacho
 * @version 02 - 02 - 2021
 */
public class Hilos extends Thread{
  int num_Hilo;
  public Hilos(String nombre){
    super(nombre);
  }

  @Override
  public void run(){
    for (int i = 0; i<num_Hilo;i++ ) {
      /* Obtenemos el nombre que ingresa en el constructor
         por medio de this*/
      System.out.println(this.getName() + i);
    }
    System.out.println("");
  }

  public void valor(int valor){
    this.num_Hilo = valor;
  }
}
