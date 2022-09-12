package Hilos.Parametros;

public class Main {
    public static void main(String[] args) {
      Hilos hl = new Hilos("Hilo 1: ");
      Hilos2 hl2 = new Hilos2("Hilo 2: ");
      
      hl.valor(5);
      hl2.valor(5);
      
      hl.start();
      hl2.start();
    }
}
