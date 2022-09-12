package Metodo_Super;
/**
 * @author Angel Saul Pascual Camacho
 * @version 02 - 02 - 2021
 */
public class Super {
  public static void main(String[] args) {
      SubClass sub = new SubClass();
      sub.saludar();

      SubClassSuper hija = new SubClassSuper();
      hija.saludar(); //MUESTRA EL METODO DE LA CLASE PADRE
  }
}
