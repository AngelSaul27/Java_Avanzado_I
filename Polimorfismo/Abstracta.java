package Polimorfismo;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public abstract class Abstracta{

    /*
    "Una clase abstracta es una clase que nunca se le crea una
    instancias: solo se usa como superclase a otras clases".
    EN UNA CLASE ABSTRACTA NO ES NECESARIO QUE TODOS LOS
    METODOS SEAN ABSTRACTOS PERO AL MENOS DEBE HABER UNO*/

    int Numero = 10, Numero2 = 15;
    int Rel;

    //Sus clases hijas debera obligatoriamente implementar este metodo
    public abstract void Operaciones(); //Metodo Abstracto -Polimorfismo-
    //La logia no podra estar establecida en un metodo Abstracto
    
    public void Imprimir(){
      System.out.println("Resultado: " + Rel);
    }

}
