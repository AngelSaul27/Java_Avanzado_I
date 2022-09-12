package Polimorfismo;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Resta extends Abstracta{
    /* PARA APLICAR EL POLIMORFISMO DEBEMOS HEREDAR
    REALIZAR O USAR UNA CLASE ABSTRACT EL CUAL DEBERA
    CONTENER UN METODO ABSTRACT Y ESTE DEBERA SER
    SOBREESCITO AL MENOS UNA VEZ */

    @Override //Sobreescritura de metodo -añadir logica-
    public void Operaciones(){ //Metodo de super clase
      Rel = Numero - Numero2;
    }
}
