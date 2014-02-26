/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaordenada;

/**
 *
 * @author usuario
 */
public class ListaOrdenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista(10);
        for (int i = 0; i < 10; i=+2) {
           lista.insertar(i);
          System.out.println(lista.buscar(i));
        }
        for (int i = 0; i < 10; i++) {
           lista.insertar(i);
          System.out.println(lista.buscar(i));
        }
            
    }
}
