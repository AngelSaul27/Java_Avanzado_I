package Try;
import java.util.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 02 - 02 - 2021
 */
public class Excepciones {
  public static void main(String[] args) {
      
      /*SI SE DIVIDE 1 ENTRE 0 SE ORIGINA UN ERROR
      Y SE MOSTRA EL ERROR*/
      
    try {
      int valor1, valor2, rel;
      Scanner in = new Scanner(System.in);

      System.out.println("Ingresa un valor");
      valor1 = in.nextInt();

      System.out.println("Ingrese un ultimo valor mas");
      valor2 = in.nextInt();

      rel = valor1 / valor2;

      System.out.println("relsultado es: " + rel);
    } catch(Exception e) {
      System.out.println("!Error! " + e);
    }
  }
}
