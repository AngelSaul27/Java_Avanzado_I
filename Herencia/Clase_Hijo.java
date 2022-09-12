package Herencia;

/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Clase_Hijo extends Clase_Padre{
  /*ESTA CLASE HERDA DE LA CLASE PADRE O SUPER CLASES
  PERMITIENDOLE ACCEDER SOLAMENTE A SUS VARIABLES Y METODOS
  PUBLICOS*/

  public void Imprimir(){
    System.out.println("Valor de Numero 1: " + Numero1);
    System.out.println("Valor de Numero 2: " + Numero2);
    System.out.println("Valor de Numero 3: " + Numero3);
    /*         [ERROR ES DE TIPO PRIVADO]
     System.out.println("Valor de Numero 1" + Numero); */
  }

  public void Llamda_De_Metodos(){
    Suma();
    //Resta(); no se puede invocar dado que la escupulación del metodo es de tipo private
    //recordando esto sabemos que, private solo puede ser accidido por su misma clase y no por otra aunque se herede de ella
    Multiplicacion();
    /*  [ERROR ES DE TIPO PRIVADO] Resta(); */
  }

  public static void main(String[] args) {
    Clase_Hijo view = new Clase_Hijo();
    view.Imprimir();
    view.Llamda_De_Metodos();
  }

}
