package Hilos.Blocked;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 02 - 2021
 */
public class Main {
  public static void main(String[] args) {
    //FORMA NORMAL AL SER HEREDADO DE LA CLASE THREAD
    Estado_Blocked view = new Estado_Blocked();
    Estado_Blocked view2 = new Estado_Blocked();
    Sleep_Class view3 = new Sleep_Class();
    Sleep_Class view4 = new Sleep_Class();
    Sleep_Class view5 = new Sleep_Class();
    
    view.start();

    /*AL HACE USO DE SLEEP PARA BLOQUAR NUESTRO HILO
      DEBEMOS COLOCARLO EN UN TRY CATCH POR SI SE PRESENTA
      UN ERROR*/
    try {
        view.sleep(1000); //se duerme por 5 seg.
    } catch (InterruptedException ex) {
        System.out.println("Error En Hilo 1: " + ex);
    }

    view2.start();
    
    try {
      view2.sleep(2000,20000);
    } catch(InterruptedException e) {
      System.out.println("Error En Hilo 2: " + e);
    }

    System.out.println("FINALIZADO....");
    System.out.println("");
    
    view3.start();
    view4.start();
    view5.start();
    view5.stop();
    // PROVOCA QUE MUERA EL HILO SIN FINALIZAR SU FUNCION
  }
}
