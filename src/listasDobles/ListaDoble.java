
package listasDobles;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson
 */
public class ListaDoble {
    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio=null;
        fin=null;   
    }
    //para identificar si la lista esta vacia
    public boolean Vacia(){
        return inicio==null;
    }
        public void AgregarFinal(int el){
        if (!Vacia()){
            fin=new NodoDoble(el,null,fin);
            fin.anterior.siguiente=fin; 
        }else{
            inicio=fin=new NodoDoble(el);                
        }
       
    }
    // para agregar nodos al final
    public void AgregarInicio(int el){
        if (!Vacia()){
            inicio=new NodoDoble(el,inicio,null);
            inicio.siguiente.anterior=inicio; 
        }else{
            inicio=fin=new NodoDoble(el);                
        }
       
    }
    //metodo para mostrar
    public void MostrarI(){
        if(!Vacia()){
            String datos="<->";
            
            NodoDoble aux=inicio;
            while(aux!=null){
            datos = datos +"[" + aux.dato+"] <->";
            aux=aux.siguiente;
                JOptionPane.showMessageDialog(null, datos, 
                        "Mostrando Listas de inicio a fin",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }
    //Metodo para mostrar Lista de inicio a fin
     public void MostrarF(){
        if(!Vacia()){
            String datos="<->";
            
            NodoDoble aux=fin;
            while(aux!=null){
            datos = datos +"[" + aux.dato+"] <->";
            aux=aux.anterior;
                JOptionPane.showMessageDialog(null, datos, 
                        "Mostrando Listas de inicio a fin",
                        JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }
    
}
