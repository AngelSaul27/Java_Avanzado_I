package Operaciones_Matricez;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 02 - 2021
 */
public class Impresion {
    public void Imprimir(int Matriz3[][],int Matriz2[][], int Matriz1[][]){

      /*IMPRESION DE LA PRIMERA MATRIZ*/
      for(int i = 0; i<Matriz1.length;i++){
          for (int j = 0; j < Matriz1.length; j++) {
              System.out.print("[" + Matriz1[i][j] +"]");
          }
          System.out.println("");
      }System.out.println("");

      /*IMPRESION DE LA SEGUNDA MATRIZ*/
      for(int i = 0; i<Matriz2.length; i++){
          for (int j = 0; j < Matriz2.length; j++) {
              System.out.print("[" + Matriz2[i][j] +"]");
          }
          System.out.println("");
      }System.out.println("");

      /*IMPRESION DEL RESULTADO*/
      for(int i = 0; i<Matriz3.length;i++){
          for (int j = 0; j < Matriz3.length; j++) {
              System.out.print("[" + Matriz3[i][j] +"]");
          }
          System.out.println("");
      }System.out.println("");
    }
}
