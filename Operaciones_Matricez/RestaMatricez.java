package Operaciones_Matricez;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 02 - 2021
 */
public class RestaMatricez {
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
          Matriz03[i][j] = Matriz01[i][j] - Matriz02[i][j];
        }
      }

      //System.out.println(Arrays.deepToString(Matriz03));

      Impresion Imp = new Impresion();
      Imp.Imprimir(Matriz03,Matriz02,Matriz01);
    }
}
