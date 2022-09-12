package Hilos.Blocked;
/**
 * @author Angel Saul Pascual Camacho
 * @version 05 - 02 - 2021
 */
public class Estado_Blocked extends Thread{

  @Override
  public void run(){
        for (int I = 0; I <= 5 ; I++) {
          System.out.println("CICLO: " + I + " " + getName());
        }System.out.println("");
    }
}
