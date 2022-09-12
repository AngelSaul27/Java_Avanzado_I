package Operaciones_Matricez;

import java.util.Arrays;

/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 02 - 2021
 */
public class MultiplicacionMatricez {
    public static void main(String[] args) {
      int Matriz01[][] = new int[2][3];
      int Matriz02[][] = new int[3][2];
      int Matriz03[][] = new int[2][2];

      for (int i = 0; i<Matriz01.length ; i++) { //COL
        for (int j = 0; j<Matriz01[0].length ; j++) { //ROW
          Matriz01[i][j] = (int) (Math.random()*10);
        }
      }

      for (int i = 0; i<3 ; i++) {
        for (int j = 0; j<2 ; j++) {
          Matriz02[i][j] = (int) (Math.random()*10);
        }
      }

      System.out.println(Arrays.deepToString(Matriz01));
      System.out.println(Arrays.deepToString(Matriz02));

      for (int i = 0; i<4 ; i++) {
        if (Matriz03[0][0] == 0) {
          int temp = (Matriz01[0][0] * Matriz02[0][0])
              + (Matriz01[0][1] * Matriz02[1][0])
              + (Matriz01[0][2] * Matriz02[2][0]);

              Matriz03[0][0] = temp;

        } else if (Matriz03[1][0] == 0) {
          int temp = (Matriz01[1][0] * Matriz02[0][0])
              + (Matriz01[1][1] * Matriz02[1][0])
              + (Matriz01[1][2] * Matriz02[2][0]);

              Matriz03[1][0] = temp;

        } else if (Matriz03[0][1] == 0) {
          int temp = (Matriz01[0][0] * Matriz02[0][1])
              + (Matriz01[0][1] * Matriz02[1][1])
              + (Matriz01[0][2] * Matriz02[2][1]);

              Matriz03[0][1] = temp;

        } else if (Matriz03[1][1] == 0) {
          int temp = (Matriz01[1][0] * Matriz02[0][1])
              + (Matriz01[1][1] * Matriz02[1][1])
              + (Matriz01[1][2] * Matriz02[2][1]);

              Matriz03[1][1] = temp;
        }
      }

      System.out.println(Arrays.deepToString(Matriz03));

    }
}
