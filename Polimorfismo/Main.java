package Polimorfismo;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Main {
  public static void main(String[] args) {

    /*AL CREAR UNA INSTANCIA DE LA CLASE ABSTRACT INDICAMOS
    QUE LA LOGICA SE ENCUENTRA EN OTRA CLASE DADO QUE NO
    PODEMOS INSTANCIAR UNA CLAS ABSTRACT*/

    Abstracta view = new Suma();//Instancia != abstract
    view.Operaciones(); //REALIZA UNA ACCION
    view.Imprimir();

    Abstracta view2 = new Resta();
    view2.Operaciones(); //REALIZA OTRA ACCION
    view2.Imprimir();

  }
}
