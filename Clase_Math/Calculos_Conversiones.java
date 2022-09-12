package Clase_Math;
/**
 * @author Angel Saul Pascual Camacho
 * @version 08 - 02 - 2021
 */
public class Calculos_Conversiones {
  public static void main(String[] args) {
    double anguloEnGrados = 45;
    double anguloEnRadianes = Math.toRadians(anguloEnGrados);
    System.out.println("DEG a RAD : " + anguloEnGrados + " = " + anguloEnRadianes + " rad");

    anguloEnGrados = Math.toDegrees(anguloEnRadianes);
    System.out.println("RAD a DEG : " + anguloEnRadianes + " = " + anguloEnGrados + " deg");
  }
}
