package Herencia;


/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Clase_Sobrina extends Clase_Hijo{
    /*ESTA CLASE HERADA LAS VARIABLES Y METODOS DE LA
    CLASE HIJO QUE SERIA SU CLASE PADRE, PERO ASU VEZ TAMBIEN
    HERADA DE LA CLASE PADRE (SUPER CLASE O CLASE PRINCIAPAL),
    DADO QUE LA CLASE HIJO YA HEREDA DE CLASE PADRE, TAMBIEN TENDRA
    ACCESO LA CLASE SOBRINA A LA CLASE PRINCIPAL*/

    public void Imprimir(){
      System.out.println("IMPRESION DESDE CLASE SOBRINA");
      System.out.println("Valor de Numero 1: " + Numero1);
      System.out.println("Valor de Numero 2: " + Numero2);
      System.out.println("Valor de Numero 3: " + Numero3);
    }

    public void Llamda_De_Metodos(){
      Suma();
      Multiplicacion();
    }

    public static void main(String[] args) {
      Clase_Sobrina view = new Clase_Sobrina();
      view.Imprimir();
      view.Llamda_De_Metodos();
    }
}
