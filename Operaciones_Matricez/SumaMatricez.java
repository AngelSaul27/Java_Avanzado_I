package Operaciones_Matricez;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 02 - 2021
 */
public class SumaMatricez {
  /*La suma de matrices solo puede ser realizada
    entre matrices de la mismas dimensiones, por
    lo tanto la matriz resultante tendra las mismas
    dimensiones*/
  /*La suma se realiza en cada uno de los elementos
    correspondientes a cada matriz en su posicion
    actual es decir se sumara la posicion Uno[0,0]
    con la posicion Dos[0,0] y el resultado se
    guardara en TresRel[0,0]*/
    /* Para la resta se sigue el mismo patron o reglas
    con una unica diferencia que las matrices se restan*/
    public static void main(String[] args) {
      int Matriz01[][] = new int[3][3];
      int Matriz02[][] = new int[3][3];
      int Matriz03[][] = new int[3][3];

      for (int i = 0; i<Matriz01.length ; i++) {
        for (int j = 0; j<Matriz02.length ; j++) {
          Matriz01[i][j] = (int) (Math.random()*10);
          Matriz02[i][j] = (int) (Math.random()*10);
        }
      }

      for (int i = 0; i<Matriz01.length ; i++) {
        for (int j = 0; j<Matriz02.length ; j++) {
          Matriz03[i][j] = Matriz01[i][j] + Matriz02[i][j];
        }
      }
      
      Impresion Imp = new Impresion();
      Imp.Imprimir(Matriz03,Matriz02,Matriz01);
    }
}
