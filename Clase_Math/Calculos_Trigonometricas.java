package Clase_Math;
/**
 * @author Angel Saul Pascual Camacho
 * @version 08 - 02 - 2021
 */
 public class Calculos_Trigonometricas {
   public static void main(String[] args) {
     double relsultado = 0;
     double anguloGrados = 45;

     double Radianes = Math.toRadians(anguloGrados);

     /*Nos permite obtener el seno de cualquier valor
       pero para ello, el valor que debe recibir debera
       estar en grados de Radianes*/

     //Seno
     relsultado = Math.sin(Radianes); // VALOR EN RADIANES
     System.out.println("Seno de " + anguloGrados + " = " + relsultado);

     //Coseno
     relsultado = Math.cos(Radianes); // VALOR EN RADIANES
     System.out.println("Coseno de " + anguloGrados + " = " + relsultado);

     //Tangente
     relsultado = Math.tan(Radianes); // VALOR EN RADIANES
     System.out.println("Tangente de " + anguloGrados + " = " + relsultado);

     //arcos (ARCO COSENO)
     double Valor = 0.707;
     Radianes = Math.acos(Valor);
     anguloGrados = Math.toDegrees(Radianes);
     System.out.println("Arcos coseno de " + Valor + " = " + anguloGrados + "°");

     //arsin (ARCO DE SENO)
     Radianes = Math.asin(Valor);
     anguloGrados = Math.toDegrees(Radianes);
     System.out.println("Arcos seno de " + Valor + " = " + anguloGrados + "°");

     //artan (ARCO DE TANGENTE)
     Radianes = Math.atan(Valor);
     anguloGrados = Math.toDegrees(Radianes);
     System.out.println("Arcos Tangente de " + Valor + " = " + anguloGrados + "°");

     //Raiz de un numero
     int Valor2 = 10;
     double Raiz = Math.sqrt(Valor2);
     System.out.println("Raiz de " + Valor2 + " = " + Raiz);
   }
}
