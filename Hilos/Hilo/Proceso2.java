package Hilos.Hilo;
/**
 * @author Angel Saul Pascual Camacho
 * @version 02 - 02 - 2021
 */
public class Proceso2 extends Thread{
    /*LA SEFUNDA FORMA DE HACER USO DE LOS HILOS ES
      HERDANDO LA CLASE THREAD E IMPLEMENTAR SUS
      METODOS*/

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("P2: "+i);
        }
    }
}
