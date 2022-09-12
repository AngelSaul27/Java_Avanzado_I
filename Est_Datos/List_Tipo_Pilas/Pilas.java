package Est_Datos.List_Tipo_Pilas;

import javax.swing.JOptionPane;

/**
 * @author Angel Saul Pascual Camacho
 * @version 28 - 02 - 2021
 */
public class Pilas {
  /* Nos permite concocer el ultimo valor ingresado */
  private Nodo ultimovalor;
  int tamano;
  String lista = "";

  /* CONSTRUCCTOR */
  public Pilas() {
    ultimovalor = null;
    tamano = 0;
  }

  // Metodo para saber cuando la pila esta vacia
  public boolean PilaVacia() {
    /* COMPRUEBA SI ESTA VACIA Y RETORNA NULL */
    return ultimovalor == null;
  }

  /* METODO PARA INSERTAR UN NODO EN LA PILA */
  public void InsertarNodo(int nodo) {
    /* Obj de tipo Nodo y le pasamos un nodo creado en el metd */
    Nodo nuevo_nodo = new Nodo(nodo);
    nuevo_nodo.siguiente = ultimovalor;
    ultimovalor = nuevo_nodo;
    tamano++;

  }

  /* Metodo para eliminar un nodo de la pilaº */
  public int eliminarNodo() {
    int aux = ultimovalor.informacion;
    ultimovalor = ultimovalor.siguiente;
    tamano--;
    return aux;
  }

  /* CONOCER EL ULTIMO VALOR INGRESADO */
  public int MostrarUltimoValorIngresado() {
    return ultimovalor.informacion;
  }

  /* TAMAÑO DE PILA */
  public int tamanoPila() {
    return tamano;
  }

  /* VACIAR PILA */
  public void VaciarPila() {
    while (!PilaVacia()) {
      eliminarNodo();
    }
  }

  /* MOSTRAR CONTENIDO DE LA PILA */
  public void MostrarValores() {
    Nodo rel = ultimovalor;

    while (rel != null) {
      lista += rel.informacion + "\n";
      rel = rel.siguiente;
    }

    JOptionPane.showMessageDialog(null, lista);
    lista = "";
  }
}
