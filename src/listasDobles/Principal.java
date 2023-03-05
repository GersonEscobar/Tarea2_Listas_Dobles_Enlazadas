
package listasDobles;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson
 */
public class Principal {
    public static void main(String[] args) {
        ListaDoble mensajero = new ListaDoble();
        int opcion=0;
        int elemento;
        do{
            try{
                opcion=elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo al inicio\n"
                                + "2.Agregar un nodo al fin\n"
                                + "3. Mostrar la lista de inicio a fin\n"
                                + "4. Mostrar la lista de fin a inicio\n"
                                + "5. Salir\n","Menu de Opciones",
                                JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el nodo", "agregando nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        mensajero.AgregarInicio(elemento);
                        break;
                    case 2:
                        elemento= Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el nodo", "agregando nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        mensajero.AgregarFinal(elemento);
                        break;
                    case 3:
                        if(!mensajero.Vacia()){
                            mensajero.MostrarI();
                        }else{
                              JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                "lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    
                    case 4:
                        if(!mensajero.Vacia()){
                            mensajero.MostrarF();
                        }else{
                              JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                "lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "aplicacion Finalizada",
                                "fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "la opcion no esta disponible",
                                "fin",JOptionPane.INFORMATION_MESSAGE);
                        
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error"+ n.getMessage());
            }
            
        }while(opcion!=5);
    }
}
