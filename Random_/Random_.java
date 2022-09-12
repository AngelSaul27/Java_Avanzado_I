package Random_;
import java.util.Random;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 02 - 2021
 */
public class Random_ {
  /*COMO SEGUNDA OPCION DEBEMOS IMPORTAR LA CLASE RANDOM */
  public static void main(String[] args) {
    int aleatorio = 0;

    Random rdm = new Random();
    aleatorio = (int) (rdm.nextDouble()*100);
    System.out.println(aleatorio);
    
  }

}
