package Est_Datos.List_Tipo_Pilas;
/**
 * @author Angel Saul Pascual Camacho
 * @version 28 - 02 - 2021
 */
public class Nodo {

  /*Nuestro nodo contiene dos partes; informaciuon y apuntadores*/
  int informacion;
  Nodo siguiente;

  /*GUARDA LO QUE CONTIENE CADA NODO (CONSTRUCTOR)*/
  public Nodo(int valor){
    informacion = valor;
    siguiente = null;
  }

}
