package Est_Datos.List_Tipo_Pilas;
import javax.swing.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 28 - 02 - 2021
 */
public class Principal {

    private static StringBuilder message = new StringBuilder();

    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pilas pila = new Pilas();

        Createmessage();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, message));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresael valor a guardar"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo: " + pila.eliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "Pila Vacia");
                        }
                        break;
                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Esta Vacia");

                        } else {
                            JOptionPane.showMessageDialog(null, "No Esta Vaica");
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null,
                                    "Ultimo Valor Ingresado es " + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "Pìla Vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "contiene: " + pila.tamano + " nodos");
                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se Ha Vaciado Correctamente");

                        } else {
                            JOptionPane.showMessageDialog(null, "Pila Vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Erronea");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println(e);
            }

        } while (opcion != 8);
    }

    public static void Createmessage() {
        message.append("Menu de Opciones \n\n");
        message.append("1. Insertar Un Nodo\n");
        message.append("2. Eliminar Un Nodo\n");
        message.append("3. ¿La Pila Esta Vacia?\n");
        message.append("4. ¿Ultimo Valor Ingresado En La Pila?\n");
        message.append("5. ¿Cuantos Nodos Hay?\n");
        message.append("6. Vaciar Pila \n");
        message.append("7. Mostrar Contenido De La Pila\n");
        message.append("8. Salir\n");
        message.append("\n");
    }
}
