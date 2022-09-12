package Encapsulamiento_Get_Set;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Accesadores extends Encapsulado{

  public void suma(){
      int Numero2 = 10;
      int Numero = getValor();//Obtenemos el valor

      //Impresion del valor de la super clase
      System.out.println("El valor Inicial es "+getValor());

      int Rel = Numero2 + Numero;
      System.out.println(Rel);

      setValor(20);//Establecemos un nuevo valor

      Numero = getValor();//Obtenemos el valor
      Numero2 = 10;
      Rel = Numero2 + Numero;

      System.out.println(Rel);

      //Impresion del valor de la super clase
      System.out.println("El valor Final es "+getValor());
      System.out.println("Numero Protegido: " + Numero3);
  }

  public static void main(String[] args) {
      Accesadores view = new Accesadores();
      view.suma();
  }
}
