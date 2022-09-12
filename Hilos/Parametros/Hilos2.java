package Hilos.Parametros;

public class Hilos2 extends Thread{
  int num_Hilo;
  public Hilos2(String nombre){
    super(nombre);
  }

  @Override
  public void run(){
    for (int i = 0; i<num_Hilo;i++ ) {
      /* Obtenemos el nombre que ingresa en el constructor
         por medio de this*/
      System.out.println(this.getName() + i);
      /* getName es útil para obtener el nombre de los métodos,
      como una cadena. Para obtener el nombre de todos los 
      métodos de una clase, obtenga todos los métodos de ese 
      objeto de clase. Luego llame a getName () en esos 
      objetos de método.
      */
    }
    System.out.println(" ");
  }

  public void valor(int valor){
    this.num_Hilo = valor;
  }
}
