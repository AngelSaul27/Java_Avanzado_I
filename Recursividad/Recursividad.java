package Recursividad;
public class Recursividad {
    public void Imprimir(int valor){
        if(valor <= 10){
            System.out.print(valor + " ");
            Imprimir(valor+1);
        }
    }
}
