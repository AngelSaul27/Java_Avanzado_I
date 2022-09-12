package Est_Datos.List_Tipo_Cola;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]){
        int Opcion = 0, nodo_inf = 0;
        Cola cola = new Cola();
        
        do{
            try{
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Menu Opciones \n"
                +"1.- Insertar Nodo\n"
                +"2.- Extraer Nodo\n"
                +"3.- Mostar Contenido De La Cola\n"
                +"4.- Salir\n"));
                
                switch(Opcion){
                    case 1:
                        nodo_inf = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                + "Ingrese un valor a almacenar"));
                        cola.Insertar(nodo_inf);
                        break;
                    case 2:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo la cola" + cola.Extraer());
                        }else{
                            JOptionPane.showMessageDialog(null, "Vacia");
                        }
                        break;
                    case 3:
                        cola.MostrarContenido();
                        break;
                    case 4:
                        Opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no existente");
                        break;
                }
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        }while(Opcion != 4);
    }
}
