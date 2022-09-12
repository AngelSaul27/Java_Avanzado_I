package Encapsulamiento_Get_Set;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Encapsulado {
    private int Numero = 10;
    protected int Numero3 = 20;

    //Nos da permiso de acceder a la variables
    public int getValor(){
      return Numero;
    }

    //Nos permite establecer un valor a la variables
    public void setValor(int value){
      Numero = value;
    }
}
