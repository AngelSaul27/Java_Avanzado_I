package Est_Datos.List_Tipo_Cola;

import javax.swing.JOptionPane;

public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";
    
    public Cola(){
        inicioCola = null;
        finalCola = null;
    }
    
    public boolean ColaVacia(){
        if(inicioCola==null){
            return true;
        } else{
            return false;
        }
    }
    
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.Siguiente = null;
        
        if(ColaVacia()){
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        }else{
            finalCola.Siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }
    
    public int Extraer(){
        if(!ColaVacia()){
            int informacion = inicioCola.informacion;
            
            if(inicioCola == finalCola){
                inicioCola = null;
                finalCola = null;
            }else{
                inicioCola = inicioCola.Siguiente;
            }
            return informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.Siguiente;
        }
        
        String cadena[] = Cola.split(" ");
        
        for(int i = cadena.length -1; i >= 0; i--){
            ColaInvertida += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    } 
}
